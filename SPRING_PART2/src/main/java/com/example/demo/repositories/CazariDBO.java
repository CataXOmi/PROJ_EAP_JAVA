package com.example.demo.repositories;

import com.example.demo.models.Cazare;

import java.util.List;

public interface CazariDBO {
    public List<Cazare> empList();
    public void deleteEl(Integer id);
    public List<Cazare> editEl(Integer id);
}
