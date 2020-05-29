package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Vacanta;
import com.fmi.eap_spring_proj.repositories.VacantaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacantaService {

    private VacantaRepository vacantaRepository;

    @Autowired
    public VacantaService(VacantaRepository vacantaRepository) {
        this.vacantaRepository = vacantaRepository;
    }

    public List<Vacanta> getAllVacante(){
        return vacantaRepository.findAll();
    }

}
