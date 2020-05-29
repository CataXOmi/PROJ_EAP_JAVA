package com.fmi.eap_spring_proj.controllers;

import com.fmi.eap_spring_proj.models.Cazare;
import com.fmi.eap_spring_proj.services.CazareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cazare")
public class CazareController {
    private CazareService cazareService;

    @Autowired
    public CazareController(CazareService cazareService) {
        this.cazareService = cazareService;
    }

    @GetMapping("")
    public List<Cazare> getAllCazari() {
        return cazareService.getAllCazari();
    }
}
