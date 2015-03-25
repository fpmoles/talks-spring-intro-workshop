package com.frankmoley.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.UUID;

/**
 * @author Frank Moley
 */
@Controller
@RequestMapping("/default")
public class DefaultViewController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/home")
    public String defaultHomeView(@RequestParam(value="name", required = false) String name, Model model){
        if(null==name){
            model.addAttribute("foo", "World");
        }else{
            model.addAttribute("foo", name);
        }
        Person person = this.personRepository.findOne("cb834db3-47b4-4cc7-9f4a-875a017704d4");
        model.addAttribute("firstName",person.getFirstName());
        model.addAttribute("lastName", person.getLastName());
        return "index";
    }

}
