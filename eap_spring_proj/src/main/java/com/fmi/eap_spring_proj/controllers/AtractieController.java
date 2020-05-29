package com.fmi.eap_spring_proj.controllers;

import com.fmi.eap_spring_proj.models.Atractie;
import com.fmi.eap_spring_proj.services.AtractieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/atractie")
public class AtractieController {
    private AtractieService atractieService;

    @Autowired
    public AtractieController(AtractieService atractieService) {
        this.atractieService = atractieService;
    }

    @GetMapping("")
    public List<Atractie> getAllAtractii() {
        return atractieService.getAllAtractii();
    }
}
