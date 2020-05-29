package com.example.demo.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.example.demo.models.Utilizator;
import com.example.demo.repositories.UtilizatorDBO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UtilDBOimp implements UtilizatorDBO {

    private JdbcTemplate jdbcTemp;

    public UtilDBOimp(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Utilizator> empList() {
        List<Utilizator> list = jdbcTemp.query("SELECT * FROM utilizator ", new RowMapper<Utilizator>() {

            @Override
            public Utilizator mapRow(ResultSet rs, int rowNum) throws SQLException {
                Utilizator emp = new Utilizator();

                emp.setId_utilizator(rs.getInt("id_utilizator"));
                emp.setNume(rs.getString("Nume"));
                emp.setPrenume(rs.getString("Prenume"));
                emp.setEmail(rs.getString("Email"));

                return emp;
            }

        });

        return list;
    }


}