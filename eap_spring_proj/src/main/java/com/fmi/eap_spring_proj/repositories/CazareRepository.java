package com.fmi.eap_spring_proj.repositories;

import com.fmi.eap_spring_proj.models.Cazare;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CazareRepository extends JpaRepository<Cazare, Long> {

    List<Cazare> findAll();

}
