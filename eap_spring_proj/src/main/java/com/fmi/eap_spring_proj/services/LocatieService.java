package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Locatie;
import com.fmi.eap_spring_proj.repositories.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocatieService {

    private LocatieRepository locatieRepository;

    @Autowired
    public LocatieService(LocatieRepository locatieRepository) {
        this.locatieRepository = locatieRepository;
    }

    public List<Locatie> getAllLocatii(){
        return locatieRepository.findAll();
    }

}
