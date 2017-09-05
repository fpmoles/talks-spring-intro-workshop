package com.frankmoley.talks.spring.intro.config;

import com.frankmoley.talks.spring.intro.data.repository.ItemRepository;
import com.frankmoley.talks.spring.intro.data.repository.PersonRepository;
import com.frankmoley.talks.spring.intro.service.InventoryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public PersonRepository personRepository(){
        return new PersonRepository();
    }

    @Bean
    public ItemRepository itemRepository(){
        return new ItemRepository();
    }

    @Bean
    public InventoryService inventoryService(){
        return new InventoryService(itemRepository(), personRepository());
    }


    public static void main(String[] args){
        ApplicationContext context = new  AnnotationConfigApplicationContext(ApplicationConfig.class);
        InventoryService service = context.getBean(InventoryService.class);
    }



}
