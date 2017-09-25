package com.frankmoley.talks.spring.intro.exersize5;

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
