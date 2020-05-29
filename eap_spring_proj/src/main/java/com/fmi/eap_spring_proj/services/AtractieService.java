package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Atractie;
import com.fmi.eap_spring_proj.repositories.AtractieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtractieService {

    private AtractieRepository atractieRepository;

    @Autowired
    public AtractieService(AtractieRepository atractieRepository) {
        this.atractieRepository = atractieRepository;
    }

    public List<Atractie> getAllAtractii(){
        return atractieRepository.findAll();
    }

}
