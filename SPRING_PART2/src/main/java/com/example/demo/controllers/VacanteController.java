package com.example.demo.controllers;


import java.io.IOException;
import java.util.List;

import com.example.demo.models.Cazare;
import com.example.demo.models.Utilizator;
import com.example.demo.models.Vacanta;
import com.example.demo.repositories.CazariDBO;
import com.example.demo.repositories.UtilizatorDBO;
import com.example.demo.repositories.VacanteDBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VacanteController {

    @Autowired
    private VacanteDBO empDao;

    @RequestMapping(value = "/vacante")
    public ModelAndView listEmployee(ModelAndView model) throws IOException {

        List<Vacanta> listEmp = empDao.empList();
        model.addObject("listEmp", listEmp);
        model.setViewName("vacante");

        return model;
    }



    @RequestMapping(value="/delet/{id}",method = RequestMethod.POST)
    public String deleteVacante(@PathVariable Integer id){
        List<Vacanta> listEmp = empDao.empList();
        listEmp.remove(id);
        empDao.deleteEl(id);
        System.out.println(id);
        return "redirect:/vacante";
    }

    @RequestMapping(value="/vacanta_register",method = RequestMethod.POST)
    public String addVacanta(@RequestParam(value = "denumite", required = false) String denumire,
                            @RequestParam(value = "data_incepere", required = false) String data_incepere,
                            @RequestParam(value = "data_finala", required = false) String data_finala){
        Vacanta x = new Vacanta();
        x.setDenumire(denumire);
        if(x.getDenumire() != null)
            System.out.println(x.getDenumire());

        return "vacanta_register";
    }
    @RequestMapping(value="/vacanta_success",method = RequestMethod.POST)
    public String SuccesVacanta(){


        return "redirect:/vacante";
    }
}