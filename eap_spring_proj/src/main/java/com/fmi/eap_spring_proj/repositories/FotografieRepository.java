package com.fmi.eap_spring_proj.repositories;

import com.fmi.eap_spring_proj.models.Fotografie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FotografieRepository extends JpaRepository<Fotografie, Long> {

    List<Fotografie> findAll();

}
