package com.fmi.eap_spring_proj.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.fmi.eap_spring_proj.models.Utilizator;
import com.fmi.eap_spring_proj.services.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UtilizatorController {

    @Autowired
    private UtilizatorService utilizatorService;

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView model = new ModelAndView();

        model.setViewName("utilizator/login");
        return model;
    }

    @RequestMapping(value = {"/signup"}, method = RequestMethod.GET)
    public ModelAndView signup() {
        ModelAndView model = new ModelAndView();
        Utilizator utilizator = new Utilizator();
        model.addObject("utilizator", utilizator);
        model.setViewName("utilizator/signup");

        return model;
    }

    @RequestMapping(value = {"/signup"}, method = RequestMethod.POST)
    public ModelAndView createUtilizator(@Valid Utilizator utilizator, BindingResult bindingResult) {
        ModelAndView model = new ModelAndView();
        Utilizator utilizatorExists = utilizatorService.findUtilizatorByEmail(utilizator.getEmail());

        if(utilizatorExists != null) {
            bindingResult.rejectValue("email", "error.utilizator", "This email already exists!");
        }
        if(bindingResult.hasErrors()) {
            model.setViewName("utilizator/signup");
        } else {
            utilizatorService.saveUtilizator(utilizator);
            model.addObject("msg", "User has been registered successfully!");
            model.addObject("utilizator", new Utilizator());
            model.setViewName("utilizator/signup");
        }

        return model;
    }

    @RequestMapping(value = {"/home/home"}, method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView model = new ModelAndView();
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Utilizator utilizator = utilizatorService.findUtilizatorByEmail(auth.getName());

        model.addObject("userName", utilizator.getNume() + " " + utilizator.getPrenume());
        model.setViewName("home/home");

        return model;
    }

    @RequestMapping(value = {"/access_denied"}, method = RequestMethod.GET)
    public ModelAndView accessDenied() {
        ModelAndView model = new ModelAndView();
        model.setViewName("errors/access_denied");

        return model;
    }


    /*@Autowired
    public UtilizatorController(UtilizatorService utilizatorService) {
        this.utilizatorService = utilizatorService;
    }*/

    /*@GetMapping("")
    public List<Utilizator> getAllUtilizatori() {
        return utilizatorService.getAllUtilizatori();
    }*/


}
