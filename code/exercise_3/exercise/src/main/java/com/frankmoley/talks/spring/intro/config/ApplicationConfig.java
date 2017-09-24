package com.frankmoley.talks.spring.intro.config;

import com.frankmoley.talks.spring.intro.service.InventoryService;
import com.frankmoley.talks.spring.intro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.frankmoley.talks.spring.intro"})
public class ApplicationConfig {

   @Autowired
   private Environment environment;


    public static void main(String[] args){
        ApplicationContext context = new  AnnotationConfigApplicationContext(ApplicationConfig.class);
        InventoryService service = context.getBean(InventoryService.class);
        UserService userService = context.getBean(UserService.class);
        userService.getUser("biglebowski@thedude.com");
    }



}
