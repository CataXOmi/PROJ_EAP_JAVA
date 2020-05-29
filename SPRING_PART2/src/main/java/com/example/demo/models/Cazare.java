package com.example.demo.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity(name = "cazare")
public class Cazare {
    @Id
    private Integer id_cazare;

    private String Nume;
    private String Tip_cazare;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date Data_sosire;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date Data_plecare;
    private String Oras;
    private String Rating;
    private String Adresa;
    private float Pret;

    /*public Cazare(int id_cazare, String nume, String tip_cazare, Date data_sosire, Date data_plecare, String oras, String rating, String adresa, float pret) {
        this.id_cazare = id_cazare;
        Nume = nume;
        Tip_cazare = tip_cazare;
        Data_sosire = data_sosire;
        Data_plecare = data_plecare;
        Oras = oras;
        Rating = rating;
        Adresa = adresa;
        Pret = pret;
    }*/

    public Integer getId_cazare() {
        return id_cazare;
    }

    public String getNume() {
        return Nume;
    }

    public String getTip_cazare() {
        return Tip_cazare;
    }

    public Date getData_sosire() {
        return Data_sosire;
    }

    public Date getData_plecare() {
        return Data_plecare;
    }

    public String getOras() {
        return Oras;
    }

    public String getRating() {
        return Rating;
    }

    public String getAdresa() {
        return Adresa;
    }

    public float getPret() {
        return Pret;
    }

    public void setId_cazare(Integer id_cazare) {
        this.id_cazare = id_cazare;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setTip_cazare(String tip_cazare) {
        Tip_cazare = tip_cazare;
    }

    public void setData_sosire(Date data_sosire) {
        Data_sosire = data_sosire;
    }

    public void setData_plecare(Date data_plecare) {
        Data_plecare = data_plecare;
    }

    public void setOras(String oras) {
        Oras = oras;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }

    public void setPret(float pret) {
        Pret = pret;
    }
}
