package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity(name = "atractie")
public class Atractie {
    @Id
    private Integer id_atractie;

    private String Denumire;
    private float Cost;
    private String Recenzie;
    private float Nota;
    private Date Data_vizita;

    /*public Atractie(int id_atractie, String denumire, float cost, String recenzie, float nota, Date data_vizita) {
        this.id_atractie = id_atractie;
        Denumire = denumire;
        Cost = cost;
        Recenzie = recenzie;
        Nota = nota;
        Data_vizita = data_vizita;
    }*/

    public Integer getId_atractie() {
        return id_atractie;
    }

    public String getDenumire() {
        return Denumire;
    }

    public float getCost() {
        return Cost;
    }

    public String getRecenzie() {
        return Recenzie;
    }

    public float getNota() {
        return Nota;
    }

    public Date getData_vizita() {
        return Data_vizita;
    }

    public void setId_atractie(Integer id_atractie) {
        this.id_atractie = id_atractie;
    }

    public void setDenumire(String denumire) {
        Denumire = denumire;
    }

    public void setCost(float cost) {
        Cost = cost;
    }

    public void setRecenzie(String recenzie) {
        Recenzie = recenzie;
    }

    public void setNota(float nota) {
        Nota = nota;
    }

    public void setData_vizita(Date data_vizita) {
        Data_vizita = data_vizita;
    }
}