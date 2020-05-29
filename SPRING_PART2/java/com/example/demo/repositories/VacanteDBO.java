package com.example.demo.repositories;


import com.example.demo.models.Vacanta;

import java.util.List;

public interface VacanteDBO {
    public List<Vacanta> empList();
    public void deleteEl(Integer id);
}
