package com.fmi.eap_spring_proj.repositories;

import com.fmi.eap_spring_proj.models.Vacanta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VacantaRepository extends JpaRepository<Vacanta, Long> {

    List<Vacanta> findAll();

}
