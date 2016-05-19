package com.llf.spring.day5_17.SH_integrate.test;

import com.llf.spring.day5_16.test.CashierImpl;
import com.llf.spring.day5_17.SH_integrate.service.BookShopService;
import com.llf.spring.day5_17.SH_integrate.service.Cashier;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;

/**
 * Created by lenovo on 2016/5/19.
 */
public class TestSH {
    private ApplicationContext ctx=null;
    private BookShopService bookShopService=null;
    private Cashier cashier=null;
    {
        ctx=new ClassPathXmlApplicationContext(
                "com/llf/spring/day5_17/SH_integrate/applicationContext.xml");
        bookShopService=ctx.getBean(BookShopService.class);
        cashier= ctx.getBean(Cashier.class);
    }

    //测试Cashier
    @Test
    public void testCashier(){
        cashier.checkout("llf", Arrays.asList("001","002"));
    }

    //测试 bookShopService
    @Test
    public void testBookShopService(){
        bookShopService.purchase("llf","001");
    }


    //测试连接
    @Test
    public void testDataSource() throws SQLException {
        DataSource dataSource= (DataSource) ctx.getBean(DataSource.class);
        System.out.println(dataSource.getConnection());
    }

}
