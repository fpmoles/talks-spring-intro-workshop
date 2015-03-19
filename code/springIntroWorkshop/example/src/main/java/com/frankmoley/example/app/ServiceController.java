package com.frankmoley.example.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Frank Moley
 */
@RestController("/rest")
@ComponentScan("com.frankmoley.example.app")
public class ServiceController {

    @RequestMapping(method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
