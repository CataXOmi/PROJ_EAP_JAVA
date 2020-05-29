package com.fmi.eap_spring_proj.services;

import com.fmi.eap_spring_proj.models.Utilizator;
import com.fmi.eap_spring_proj.repositories.UtilizatorRepository;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UtilizatorServiceImpl implements UtilizatorService {

    @Qualifier("utilizatorRepository")
    @Autowired
    private UtilizatorRepository utilizatorRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Utilizator findUtilizatorByEmail(String email) {
        return utilizatorRepository.findByEmail(email);
    }

    @Override
    public void saveUtilizator(Utilizator utilizator) {
        utilizator.setUsername(utilizator.getUsername());
        utilizator.setParola(bCryptPasswordEncoder.encode(utilizator.getParola()));
        utilizator.setParola_2(bCryptPasswordEncoder.encode(utilizator.getParola_2()));
        utilizator.setActiv(1);
        utilizatorRepository.save(utilizator);
    }

    public Utilizator getUtilizator(String email)   {
        System.out.println(utilizatorRepository.findByEmail(email));
        return utilizatorRepository.findByEmail(email);}

}
