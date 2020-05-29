package com.fmi.eap_spring_proj.repositories;

import com.fmi.eap_spring_proj.models.Locatie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LocatieRepository extends JpaRepository<Locatie, Long> {

    List<Locatie> findAll();

}

