package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;

@Entity(name = "fotografie")
public class Fotografie {
    @Id
    private Integer id_foto;
    private String Nume_fotografie;
    private Time Ora;
    private String Nume_fotograf;

    /*public Fotografie(int id_foto, Time ora, String nume_fotograf) {
        this.id_foto = id_foto;
        Ora = ora;
        Nume_fotograf = nume_fotograf;
    }*/

    public String getNume_fotografie() {
        return Nume_fotografie;
    }

    public void setNume_fotografie(String nume_fotografie) {
        Nume_fotografie = nume_fotografie;
    }

    public Integer getId_foto() {
        return id_foto;
    }

    public Time getOra() {
        return Ora;
    }

    public String getNume_fotograf() {
        return Nume_fotograf;
    }

    public void setId_foto(Integer id_foto) {
        this.id_foto = id_foto;
    }

    public void setOra(Time ora) {
        Ora = ora;
    }

    public void setNume_fotograf(String nume_fotograf) {
        Nume_fotograf = nume_fotograf;
    }
}
