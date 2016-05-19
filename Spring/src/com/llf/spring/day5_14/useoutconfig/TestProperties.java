package com.llf.spring.day5_14.useoutconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by lenovo on 2016/5/14.
 */
public class TestProperties {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/llf/spring/day5_14/useoutconfig/bean-properties.xml");

        DataSource dataSource= (DataSource) ctx.getBean("dataSource2");
        System.out.println(dataSource.getConnection()); //测试连接

    }
}
