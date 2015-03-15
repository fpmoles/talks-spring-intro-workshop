package com.frankmoley.intro.example;

import com.frankmoley.intro.config.ExampleConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Frank P. Moley III.
 */
public class WidgetManager {

    public static void main(String[] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExampleConfig.class);

    }
}
