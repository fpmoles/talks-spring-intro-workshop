package com.frankmoley.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@ComponentScan("com.frankmoley")
@EnableWebMvc
public class InclassExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(InclassExampleApplication.class, args);
    }
}
