package com.llf.spring.day5_16.jdbctemplate;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2016/5/16.
 */
@Repository
public class PersonDao {
    @Autowired
    private JdbcTemplate jdbcTemplate = null;

    public Person getById(int id) {
        String sql = "select * from t_spring where id=?";
        RowMapper<Person> rowMapper = new BeanPropertyRowMapper<Person>(Person.class);
        Person person = jdbcTemplate.queryForObject(sql, rowMapper, 2);
        return person;
    }
}
