package com.frankmoley.talks.spring.intro.web.app;

import com.frankmoley.talks.spring.intro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class AppController {

    private final UserService userService;

    @Autowired
    public AppController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public String getHome(Model model){
        model.addAttribute("users", this.userService.getAllUsers());
        return "index";
    }
}
