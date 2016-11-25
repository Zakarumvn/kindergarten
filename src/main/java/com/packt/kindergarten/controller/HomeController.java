package com.packt.kindergarten.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RM on 2016-11-20.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Witaj w przedszkolu! Pozdrowienia od Konrada, Siiiiiiuuuu, asdasdasdasd");
        return "welcome";
    }
}