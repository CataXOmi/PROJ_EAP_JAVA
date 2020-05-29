package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String greeting() {
        return "home";
    }
    @RequestMapping(value="/home", method = RequestMethod.GET)
    public String home() {
        return "userhome";
    }

}