package com.scm.scm.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){

        // sending data to home.html
        System.out.println("This is home page");
        model.addAttribute("name","SubString Technologies");
        model.addAttribute("youtube","hello World");
        return "Home";
    }
}
