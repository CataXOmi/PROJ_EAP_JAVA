package com.example.demo.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.example.demo.models.Atractie;
import com.example.demo.models.Utilizator;

import com.example.demo.models.Vacanta;
import com.example.demo.repositories.AtractieDBO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class AtrDBOimp implements AtractieDBO {

    private JdbcTemplate jdbcTemp;

    public AtrDBOimp(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Atractie> empList() {
        List<Atractie> list = jdbcTemp.query("SELECT * FROM atractie", new RowMapper<Atractie>() {

            @Override
            public Atractie mapRow(ResultSet rs, int rowNum) throws SQLException {
                Atractie emp = new Atractie();

                emp.setId_atractie(rs.getInt("id_atractie"));
                emp.setDenumire(rs.getString("Denumire"));
                emp.setCost(rs.getFloat("Cost"));
                emp.setRecenzie(rs.getString("Recenzie"));
                emp.setNota(rs.getFloat("Nota"));
                emp.setData_vizita(rs.getDate("data_vizita"));


                return emp;
            }

        });

        return list;
    }
    @Override
    public void deleteEl(Integer id){
        String Eldel = "DELETE FROM atractie WHERE id_atractie= " + id.toString();
        jdbcTemp.update(Eldel);
    }

}