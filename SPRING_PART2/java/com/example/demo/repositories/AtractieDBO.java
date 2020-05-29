package com.example.demo.repositories;

import com.example.demo.models.Atractie;

import java.util.List;

public interface AtractieDBO {
    public List<Atractie> empList();
    public void deleteEl(Integer id);
}
