package com.llf.spring.day5_16.transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created by lenovo on 2016/5/16.
 */
@Repository
public class BookDao {
    @Autowired
    private JdbcTemplate jdbcTemplate = null;

    //更新图书库存
    public void testUpdateBook(int id) {
        //查询图书库存是否足够，否则抛出异常
        String sql = "select num from t_book where id=?";
        int count = jdbcTemplate.queryForObject(sql, Integer.class, id);
        if (count == 0) {
            throw new BookException("库存不足！");
        }

        sql = "update t_book set num=num-1 where id=?";
        jdbcTemplate.update(sql, id);

    }

    //查询资金是否足够，不够抛异常
    public void testUpdateAccount(int id, int price) {
        String sql = "select money from t_account where id=?";
        int money = jdbcTemplate.queryForObject(sql, Integer.class, id);
        if (money < price) {
            throw new AccountException("资金不足！");
        }

        sql = "update t_account set money=money-? where id=?";
        jdbcTemplate.update(sql, price, id);
    }

}
