package com.fmi.eap_spring_proj.models;

import javax.persistence.*;

@Entity(name = "locatie")
//@Table(name = "locatie")
public class Locatie {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_locatie;

    private String Tara;
    private String Oras;
    private String Adresa;

    /*public Locatie(int id_locatie, String tara, String oras, String adresa) {
        this.id_locatie = id_locatie;
        Tara = tara;
        Oras = oras;
        Adresa = adresa;
    }*/

    public Integer getId_locatie() {
        return id_locatie;
    }

    public String getTara() {
        return Tara;
    }

    public String getOras() {
        return Oras;
    }

    public String getAdresa() {
        return Adresa;
    }

    public void setId_locatie(Integer id_locatie) {
        this.id_locatie = id_locatie;
    }

    public void setTara(String tara) {
        Tara = tara;
    }

    public void setOras(String oras) {
        Oras = oras;
    }

    public void setAdresa(String adresa) {
        Adresa = adresa;
    }
}
