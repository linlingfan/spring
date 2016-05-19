package com.llf.spring.day5_16.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/5/16.\
 * 注：在静态代码块里的属性，在外面应该被定义为静态属性否则报错
 * 静态变量属于整个类的变量，而不是某个对象
 */
public class TestJdbcTemplate {
    private static ApplicationContext ctx = null;
    private JdbcTemplate jdbcTemplate = null;

    //测试数据库连接
    {
        ctx = new ClassPathXmlApplicationContext("com/llf/spring/day5_16/jdbctemplate/bean-jdbctemplate.xml");
        jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
    }

    /**
     * 测试开发的时候放到DAO层的用法
     */
    @Test
    public void testDao(){
        PersonDao personDao= (PersonDao) ctx.getBean(PersonDao.class);
        System.out.println(personDao.getById(2));
    }

    //查询单列，统计
    @Test
    public void testQueryForObject2() {
        String sql = "SELECT count(*) FROM t_spring where id>1";
        long num = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(num);
    }


    /**
     * 查询实体类的集合
     * 注意不是使用queryForList()的方法
     */

    @Test
    public void testQueryForList() {
        String sql = "select * from t_spring where id>?";
        RowMapper<Person> rowMap = new BeanPropertyRowMapper<Person>(Person.class);//RowMap指定如何去映射结果集的行
        List<Person> persons = jdbcTemplate.query(sql, rowMap, 1);
        System.out.println(persons);

    }

    /**
     * 查询数据，实际得到对应的一个对象
     * 可以使用sql中的列的别名王城列别名和类属性吗的映射,但是如果有关联外键还是不能直接查询出来（不支持级联操作）
     * 如下：执行car还是为空
     * 不支持联级操作，jdbc只是一个小工具，不是ORM框架
     */

    @Test
    public void testQueryForObject() {
        String sql = "select id,name,age,car_id AS\"car.id\" from t_spring where id=?";
        RowMapper<Person> rowMap = new BeanPropertyRowMapper<Person>(Person.class);//RowMap指定如何去映射结果集的行
        Person person = jdbcTemplate.queryForObject(sql, rowMap, 2);
        System.out.println(person);

    }

    //测试插入数据INSERT
    @Test
    public void update() {
        String sql = "INSERT INTO t_spring(id,name,age) values(?,?,?)";
        //批量更新（插入）
        List<Object[]> batch = new ArrayList<Object[]>();
        batch.add(new Object[]{1, "llf", 21});
        batch.add(new Object[]{2, "llf2", 21});
        batch.add(new Object[]{3, "llf3", 21});
        batch.add(new Object[]{4, "llf4", 21});
        jdbcTemplate.batchUpdate(sql, batch);
    }

    //测试删除delete
    @Test
    public void delete() {
        String sql = "delete FROM t_department where id=?";
        jdbcTemplate.update(sql, 11);
    }


    @Test
    public void testDateSource() throws SQLException {
        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }


    public static void main(String[] args) {


    }
}
