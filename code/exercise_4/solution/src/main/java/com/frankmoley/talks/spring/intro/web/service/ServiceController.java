package com.frankmoley.talks.spring.intro.web.service;

import com.frankmoley.talks.spring.intro.service.UserService;
import com.frankmoley.talks.spring.intro.service.domain.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ServiceController {

    private final UserService userService;

    @Autowired
    public ServiceController(UserService userService){
        super();
        this.userService=userService;
    }


    @GetMapping("/users")
    public List<User> getUsers(){
        return this.userService.getAllUsers();
    }
}
