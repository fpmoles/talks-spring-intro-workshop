package com.frankmoley.talks.spring.intro.config;

import com.frankmoley.talks.spring.intro.data.entity.ItemEntity;
import com.frankmoley.talks.spring.intro.data.entity.PersonEntity;
import com.frankmoley.talks.spring.intro.data.repository.ItemRepository;
import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;
import com.frankmoley.talks.spring.intro.service.InventoryService;
import com.frankmoley.talks.spring.intro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.frankmoley.talks.spring.intro"})
@EnableJpaRepositories(basePackages = "com.frankmoley.talks.spring.intro.data.repository")
@EnableTransactionManagement
public class ApplicationConfig {

    @Autowired
    private Environment environment;

    @Bean
    public DataSource dataSource(){
        EmbeddedDatabaseBuilder databaseBuilder = new EmbeddedDatabaseBuilder();
        return databaseBuilder.setType(EmbeddedDatabaseType.H2)
                .addScript("schema.sql")
                .addScript("data.sql")
                .build();
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {

        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setPackagesToScan("com.frankmoley.talks.spring.intro.data.entity");
        entityManagerFactory.setDataSource(dataSource());
        HibernateJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
        vendor.setShowSql(false);
        vendor.setGenerateDdl(false);
        vendor.setDatabase(Database.H2);
        entityManagerFactory.setJpaVendorAdapter(vendor);
        return entityManagerFactory;
    }

    @Bean
    public JpaTransactionManager transactionManager() {
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory().getNativeEntityManagerFactory());
        return jpaTransactionManager;
    }


    public static void main(String[] args){
        ApplicationContext context = new  AnnotationConfigApplicationContext(ApplicationConfig.class);
        InventoryService service = context.getBean(InventoryService.class);
        UserService userService = context.getBean(UserService.class);
        userService.getUser("biglebowski@thedude.com");

        PersonRepository personRepository = context.getBean(PersonRepository.class);
        Iterable<PersonEntity> people =  personRepository.findAll();
        people.forEach(System.out::println);
        ItemRepository itemRepository = context.getBean(ItemRepository.class);
        List<ItemEntity> items = itemRepository.findByPersonId(1L);
        items.forEach(System.out::println);
    }



}
