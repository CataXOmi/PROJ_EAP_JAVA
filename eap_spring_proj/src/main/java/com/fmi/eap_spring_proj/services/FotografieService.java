package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Fotografie;
import com.fmi.eap_spring_proj.repositories.FotografieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FotografieService {

    private FotografieRepository fotografieRepository;

    @Autowired
    public FotografieService(FotografieRepository fotografieRepository) {
        this.fotografieRepository = fotografieRepository;
    }

    public List<Fotografie> getAllFotografii(){
        return fotografieRepository.findAll();
    }

}
