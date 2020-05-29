package com.example.demo.services;


import com.example.demo.models.Fotografie;
import com.example.demo.repositories.FotografieDBO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FotDBOimp implements FotografieDBO {
    private JdbcTemplate jdbcTemp;

    public FotDBOimp(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Fotografie> empList() {
        List<Fotografie> list = jdbcTemp.query("SELECT * FROM fotografie", new RowMapper<Fotografie>() {

            @Override
            public Fotografie mapRow(ResultSet rs, int rowNum) throws SQLException {
                Fotografie emp = new Fotografie();

                emp.setId_foto(rs.getInt("id_foto"));
                emp.setNume_fotografie(rs.getString("nume_fotografie"));
                emp.setOra(rs.getTime("ora"));
                emp.setNume_fotograf(rs.getString("nume_fotograf"));

                return emp;
            }

        });

        return list;
    }

}
