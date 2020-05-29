package com.fmi.eap_spring_proj.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity(name="utilizator")
@Table(name="utilizator")
public class Utilizator {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_utilizator;

    private String username;
    private String nume;
    private String prenume;
    private String email;
    private String parola;
    private String roles = "";
    private int activ;
    private String parola_2;

    public Utilizator() {
    }

    public Utilizator(String username, String nume, String prenume, String email, String parola, String roles) {
        this.username = username;
        this.nume = nume;
        this.prenume = prenume;
        this.email = email;
        this.parola = parola;
        this.roles = roles;
        this.activ = 1;
    }

    public Integer getId_utilizator() {
        return id_utilizator;
    }

    public String getUsername() {
        return username;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getEmail() { return email; }

    public String getParola() { return parola; }

    public String getParola_2() {
        return parola_2;
    }

    public String getRoles() { return roles; }

    public int getActiv() { return activ; }

    public void setId_utilizator(Integer id_utilizator) {
        this.id_utilizator = id_utilizator;
    }

    public void setUsername(String username) { this.username = username; }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) { this.prenume = prenume; }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setParola(String parola) { this.parola = parola; }

    public void setParola_2(String parola_2) { this.parola_2 = parola_2; }

    public void setRoles(String roles) { this.roles = roles; }

    public void setActiv(int activ) { this.activ = activ; }

    public List<String> getRoleList(){
        if(roles.length() > 0){
            return Arrays.asList(roles.split(","));
        }
        else return new ArrayList<>();
    }
}
