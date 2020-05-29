package com.fmi.eap_spring_proj.models;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "vacanta")
//@Table(name = "vacanta")
public class Vacanta {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_vacanta;

    private String Denumire;
    private Date Data_incepere;
    private Date Data_finala;
    private float Cheltuieli;
    private String Tip_vacanta;

    /*public Vacanta(int id_vacanta, String denumire, Date data_incepere, Date data_finala, float cheltuieli, String tip_vacanta) {
        this.id_vacanta = id_vacanta;
        Denumire = denumire;
        Data_incepere = data_incepere;
        Data_finala = data_finala;
        Cheltuieli = cheltuieli;
        Tip_vacanta = tip_vacanta;
    }*/

    public Integer getId_vacanta() {
        return id_vacanta;
    }

    public Date getData_incepere() {
        return Data_incepere;
    }

    public Date getData_finala() {
        return Data_finala;
    }

    public float getCheltuieli() {
        return Cheltuieli;
    }

    public String getTip_vacanta() {
        return Tip_vacanta;
    }

    public void setId_vacanta(Integer id_vacanta) {
        this.id_vacanta = id_vacanta;
    }

    public void setData_incepere(Date data_incepere) {
        Data_incepere = data_incepere;
    }

    public void setData_finala(Date data_finala) {
        Data_finala = data_finala;
    }

    public void setCheltuieli(float cheltuieli) {
        Cheltuieli = cheltuieli;
    }

    public void setTip_vacanta(String tip_vacanta) {
        Tip_vacanta = tip_vacanta;
    }
    public void setDenumire(String denumire) {
        Denumire = denumire;
    }

    public String getDenumire() {
        return Denumire;
    }
}