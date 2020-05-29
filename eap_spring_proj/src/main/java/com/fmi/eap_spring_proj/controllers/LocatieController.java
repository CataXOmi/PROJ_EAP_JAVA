package com.fmi.eap_spring_proj.controllers;

import com.fmi.eap_spring_proj.models.Locatie;
import com.fmi.eap_spring_proj.services.LocatieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locatie")
public class LocatieController {
    private LocatieService locatieService;

    @Autowired
    public LocatieController(LocatieService locatieService) {
        this.locatieService = locatieService;
    }

    @GetMapping("")
    public List<Locatie> getAllLocatii() {
        return locatieService.getAllLocatii();
    }
}
