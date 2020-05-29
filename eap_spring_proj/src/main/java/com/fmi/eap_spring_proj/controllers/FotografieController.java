package com.fmi.eap_spring_proj.controllers;

import com.fmi.eap_spring_proj.models.Fotografie;
import com.fmi.eap_spring_proj.services.FotografieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fotografie")
public class FotografieController {
    private FotografieService fotografieService;

    @Autowired
    public FotografieController(FotografieService fotografieService) {
        this.fotografieService = fotografieService;
    }

    @GetMapping("")
    public List<Fotografie> getAllFotografii() {
        return fotografieService.getAllFotografii();
    }
}
