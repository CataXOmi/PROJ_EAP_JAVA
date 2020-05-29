package com.example.demo.controllers;


import java.io.IOException;
import java.sql.Date;
import java.util.List;

import com.example.demo.models.Cazare;
import com.example.demo.models.Utilizator;
import com.example.demo.repositories.CazariDBO;
import com.example.demo.repositories.UtilizatorDBO;
import org.apache.tomcat.util.http.fileupload.ProgressListener;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CazariRegController {


    @Autowired
    private CazariDBO empDao;


    @RequestMapping(value = "/cazari", method = RequestMethod.GET)
    public ModelAndView Cazari(ModelAndView model) throws IOException {
        List<Cazare> listEmp = empDao.empList();
        model.addObject("listEmp", listEmp);
        model.setViewName("cazari");

        return model;
    }
    @RequestMapping(value="/delete/{id}",method = RequestMethod.POST)
    public String deleteCazare(@PathVariable Integer id){
        List<Cazare> listEmp = empDao.empList();
        listEmp.remove(id);
        empDao.deleteEl(id);
        System.out.println(id);
        return "redirect:/cazari";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String EditCazare(@PathVariable Integer id, Model model) throws IOException {
        List<Cazare> listEmp = empDao.editEl(id);
        model.addAttribute("cazare",listEmp.get(0));
        System.out.println(listEmp.get(0).getNume());
        return "cazare_edit";
    }
    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String EditCazareget(@PathVariable Integer id, Model model) throws IOException {

        return "cazare_edit";
    }
    @RequestMapping(value="/edit",method = RequestMethod.POST)
    public String adCazare(@RequestParam(value = "id", required = false) Integer id, Model model
    ){
        model.addAttribute("id",id);
        System.out.println(id);
        return "edit";
    }
    @RequestMapping(value="/edit",method = RequestMethod.GET)
    public String aCazare(@RequestParam(value = "id", required = false) Integer id, Model model
    ){
        id=12;
       model.addAttribute("id",id);
        System.out.println(id);
        return "edit";
    }
    @RequestMapping(value="/cazare_register",method = RequestMethod.POST)
    public String addCazare(@RequestParam(value = "nume", required = false) String nume,
                            @RequestParam(value = "tip_cazare", required = false) String tip_cazare,
                            @RequestParam(value = "data_sosire", required = false) String data_sosire
                            ){
        Cazare x = new Cazare();
        x.setNume(nume);
        if(x.getNume() != null)
            System.out.println(x.getNume());

        return "edit";
    }
    @RequestMapping(value="/cazare_success",method = RequestMethod.POST)
    public String SuccesCazare(){
        return "redirect:/cazari";
    }




}