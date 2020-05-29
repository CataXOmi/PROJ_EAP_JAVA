package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Utilizator;

import org.springframework.stereotype.Service;

@Service
public interface UtilizatorService {

    public Utilizator findUtilizatorByEmail(String email);

    public void saveUtilizator(Utilizator utilizator);

    public Utilizator getUtilizator(String email);


    /*@Autowired
    public UtilizatorService(UtilizatorRepository utilizatorRepository) {
        this.utilizatorRepository = utilizatorRepository;
    }

    public List<Utilizator> getAllUtilizatori(){
        return utilizatorRepository.findAll();
    }*/

}

