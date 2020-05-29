package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "utilizator")
public class Utilizator {

    @Id
    private Integer id_utilizator;

    private String Nume;
    private String Prenume;
    private String Email;
    private String Parola;

    /*public Utilizator(Integer id_utilizator, String nume, String prenume, String email, String parola) {
        this.id_utilizator = id_utilizator;
        Nume = nume;
        Prenume = prenume;
        Email = email;
        Parola = parola;
    }*/

    public Integer getId_utilizator() {
        return id_utilizator;
    }

    public String getNume() {
        return Nume;
    }

    public String getPrenume() {
        return Prenume;
    }

    public String getEmail() {
        return Email;
    }

    public String getParola() { return Parola; }

    public void setId_utilizator(Integer id_utilizator) {
        this.id_utilizator = id_utilizator;
    }

    public void setNume(String nume) {
        Nume = nume;
    }

    public void setPrenume(String prenume) {
        Prenume = prenume;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setParola(String parola) { Parola = parola; }
}
