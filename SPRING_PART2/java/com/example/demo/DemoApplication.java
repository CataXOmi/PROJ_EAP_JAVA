package com.example.demo;

import com.example.demo.models.Fotografie;
import com.example.demo.models.Utilizator;
import com.example.demo.repositories.*;
import com.example.demo.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@SpringBootApplication
@ComponentScan("com.example.demo.repositories")
@ComponentScan("com.example.demo.services")
@ComponentScan("com.example.demo.models")
@ComponentScan("com.example.demo.controllers")


public class DemoApplication {
    @Bean
    public DriverManagerDataSource getDataSource() {

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/javaproject");
        ds.setUsername("root");
        ds.setPassword("");

        return ds;
    }


    @Bean
    public UtilizatorDBO getUtilizatorDBO() {
        return new UtilDBOimp(getDataSource());
    }
    @Bean
    public CazariDBO getCazariDBO(){
        return new CazDBOimp(getDataSource());
    }
    @Bean
    public VacanteDBO getVacanteDBO(){
        return new VacDBOimp(getDataSource());
    }
    @Bean
    public AtractieDBO getAtractieDBO(){
        return new AtrDBOimp(getDataSource());
    }

    @Bean
    public FotografieDBO getFotografieDBO(){
        return new FotDBOimp(getDataSource());
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}
