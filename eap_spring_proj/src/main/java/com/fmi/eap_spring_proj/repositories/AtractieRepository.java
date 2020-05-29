package com.fmi.eap_spring_proj.repositories;

import com.fmi.eap_spring_proj.models.Atractie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtractieRepository extends JpaRepository<Atractie, Long> {

    List<Atractie> findAll();

}
