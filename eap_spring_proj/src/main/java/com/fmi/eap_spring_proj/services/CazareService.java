package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Cazare;
import com.fmi.eap_spring_proj.repositories.CazareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CazareService {

    private CazareRepository cazareRepository;

    @Autowired
    public CazareService(CazareRepository cazareRepository) {
        this.cazareRepository = cazareRepository;
    }

    public List<Cazare> getAllCazari(){
        return cazareRepository.findAll();
    }

}
