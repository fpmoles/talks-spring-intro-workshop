package com.frankmoley.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Frank Moley
 */
@Controller
@RequestMapping("/app")
public class DefaultViewController {

    private final ServiceController serviceContoller;

    public DefaultViewController(ServiceController serviceController){
        super();
        this.serviceContoller = serviceController;
    }

    @RequestMapping("/home")
    public String viewHome(@RequestParam(value="name", required=false) String name, Model model){
        if(null == name || StringUtils.isEmpty(name.trim())){
            model.addAttribute("name", "World");
        }else{
            model.addAttribute("name", name);
        }
        return "index";
    }
}
