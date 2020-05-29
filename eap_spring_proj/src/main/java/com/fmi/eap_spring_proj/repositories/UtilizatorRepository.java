package com.fmi.eap_spring_proj.repositories;

import com.fmi.eap_spring_proj.models.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("utilizatorRepository")
public interface UtilizatorRepository extends JpaRepository<Utilizator, Long> {

    //static List<Utilizator> findAll();

    Utilizator findByEmail(String email);


    //Utilizator findByUsername(String username);

}
