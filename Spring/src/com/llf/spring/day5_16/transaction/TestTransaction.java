package com.llf.spring.day5_16.transaction;

import com.llf.spring.day5_15_1.generic.BaseService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/16.
 */
public class TestTransaction {
    private ApplicationContext ctx=null;
    private BookDao bookDao=null;
    BookService bookService =null;
    {
        ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_16/transaction/bean-transaction.xml");
        bookDao= (BookDao) ctx.getBean("bookDao");
        bookService = (BookService) ctx.getBean("bookService");
    }
    //事务测试
    @Test
    public void testBookTransaction() {

        bookService.testBookAndAccount(1,20);
    }

    //测试更新库存
    @Test
    public void testUpdateBookById() throws BookException {
        bookDao.testUpdateBook(1);
    }

    //测试更新资金
    @Test
    public  void testUpdateAccountById() throws AccountException {
        bookDao.testUpdateAccount(1,20);
    }



}
