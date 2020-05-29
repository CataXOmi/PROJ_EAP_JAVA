package com.example.demo.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import com.example.demo.models.Cazare;
import com.example.demo.repositories.CazariDBO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class CazDBOimp implements CazariDBO {

    private JdbcTemplate jdbcTemp;

    public CazDBOimp(DataSource dataSource) {
        jdbcTemp = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Cazare> empList() {
        List<Cazare> list = jdbcTemp.query("SELECT * FROM cazare JOIN vacanta ON cazare.fk_id_vacanta = vacanta.id_vacanta JOIN utilizator on vacanta.fk_id_utilizator = utilizator.id_utilizator where utilizator.id_utilizator = 1", new RowMapper<Cazare>() {

            @Override
            public Cazare mapRow(ResultSet rs, int rowNum) throws SQLException {
                Cazare emp = new Cazare();

                emp.setId_cazare(rs.getInt("id_cazare"));
                emp.setNume(rs.getString("Nume"));
                emp.setTip_cazare(rs.getString("Tip_cazare"));
                emp.setData_sosire(rs.getDate("Data_sosire"));
                emp.setData_plecare(rs.getDate("Data_plecare"));
                emp.setOras(rs.getString("Oras"));
                emp.setRating(rs.getString("Rating"));
                emp.setAdresa(rs.getString("Adresa"));
                emp.setPret(rs.getFloat("Pret"));

                return emp;
            }

        });

        return list;
    }

    @Override
    public void deleteEl(Integer id) {
        String Eldel = "DELETE FROM cazare WHERE id_cazare= " + id.toString();
        jdbcTemp.update(Eldel);
    }

    @Override
    public List<Cazare> editEl(Integer id) {
        String Eledit = "SELECT * from cazare WHERE id_cazare= " + id.toString();
        Cazare edit = new Cazare();
        List<Cazare> list = jdbcTemp.query(Eledit, new RowMapper<Cazare>() {

            @Override
            public Cazare mapRow(ResultSet rs, int rowNum) throws SQLException {
                Cazare emp = new Cazare();

                emp.setId_cazare(rs.getInt("id_cazare"));
                emp.setNume(rs.getString("Nume"));
                emp.setTip_cazare(rs.getString("Tip_cazare"));
                emp.setData_sosire(rs.getDate("Data_sosire"));
                emp.setData_plecare(rs.getDate("Data_plecare"));
                emp.setOras(rs.getString("Oras"));
                emp.setRating(rs.getString("Rating"));
                emp.setAdresa(rs.getString("Adresa"));
                emp.setPret(rs.getFloat("Pret"));

                return emp;

            }

        });
        return list;
    }
}
