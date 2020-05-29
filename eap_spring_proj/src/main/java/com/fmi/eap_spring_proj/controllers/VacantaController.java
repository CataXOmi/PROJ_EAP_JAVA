package com.fmi.eap_spring_proj.controllers;

import com.fmi.eap_spring_proj.models.Vacanta;
import com.fmi.eap_spring_proj.services.VacantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vacanta")
public class VacantaController {
    private VacantaService vacantaService;

    @Autowired
    public VacantaController(VacantaService vacantaService) {
        this.vacantaService = vacantaService;
    }

    @GetMapping("")
    public List<Vacanta> getAllVacante() {
        return vacantaService.getAllVacante();
    }
}
