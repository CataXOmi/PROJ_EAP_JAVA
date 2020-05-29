package com.example.demo.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.example.demo.models.Utilizator;

import com.example.demo.models.Vacanta;
import com.example.demo.repositories.VacanteDBO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class VacDBOimp implements VacanteDBO {

    private JdbcTemplate jdbcTemp;

    public VacDBOimp(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Vacanta> empList() {
        List<Vacanta> list = jdbcTemp.query("SELECT * FROM vacanta", new RowMapper<Vacanta>() {

            @Override
            public Vacanta mapRow(ResultSet rs, int rowNum) throws SQLException {
                Vacanta emp = new Vacanta();

                emp.setId_vacanta(rs.getInt("id_vacanta"));
                emp.setDenumire(rs.getString("Denumire"));
                emp.setData_incepere(rs.getDate("Data_incepere"));
                emp.setData_finala(rs.getDate("Data_finala"));
                emp.setCheltuieli(rs.getFloat("Cheltuieli"));
                emp.setTip_vacanta(rs.getString("Tip_vacanta"));
                return emp;
            }

        });

        return list;
    }
    @Override
    public void deleteEl(Integer id){
        String Eldel = "DELETE FROM vacanta WHERE id_vacanta= " + id.toString();
        jdbcTemp.update(Eldel);
    }

}