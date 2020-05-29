package com.example.demo.controllers;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.example.demo.models.*;
import com.example.demo.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;

@Controller
public class AtractieController {

    @Autowired
    private AtractieDBO empDao;

    @Autowired
    private FotografieDBO empFot;

    @Autowired
    JdbcTemplate jdbcTemplate;


    @RequestMapping(value = "/atractii")
    public ModelAndView atractii(ModelAndView model) throws IOException {

        List<Atractie> listEmp = empDao.empList();
        model.addObject("listEmp", listEmp);
        model.setViewName("atractii");

        return model;
    }

    @RequestMapping(value="/dele/{id}",method = RequestMethod.POST)
    public String deleteAtractie(@PathVariable Integer id){
        List<Atractie> listEmp = empDao.empList();
        listEmp.remove(id);
        empDao.deleteEl(id);
        System.out.println(id);
        return "redirect:/atractii";
    }
    @RequestMapping(value="/atractie_register",method = RequestMethod.POST)
    public String addAtractie(@RequestParam(value = "denumire", required = false) String denumire,
                            @RequestParam(value = "recenzie", required = false) String recenzie,
                            @RequestParam(value = "cost", required = false) String cost,
                            @RequestParam(value = "nota", required = false) Float nota,
                            @RequestParam(value = "data_vizita", required = false) String data_vizita){
        if(data_vizita!=null)
        data_vizita.replace("/","-");

        java.util.Date d1 = new java.util.Date();
        java.sql.Date sqlDate = new java.sql.Date(d1.getDate());
        System.out.println(data_vizita);

        if(denumire != null) {
            jdbcTemplate.update(
                    "INSERT INTO atractie (Denumire, Cost, Recenzie, Nota, Data_vizita) VALUES (?, ?, ?, ?, ?)", denumire,
                    cost, recenzie, nota, sqlDate

            );
        }



        return "atractie_register";
    }
    @RequestMapping(value="/atractie_success",method = RequestMethod.POST)
    public String SuccesAtractie(){


        return "redirect:/atractii";
    }
    @RequestMapping(value = "/poze")
    public ModelAndView poze(ModelAndView model) throws IOException {

        List<Fotografie> listEmp = empFot.empList();
        model.addObject("listEmp", listEmp);
        model.setViewName("poze");

        return model;
    }
}