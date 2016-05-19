package com.llf.spring.day5_16.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lenovo on 2016/5/16.
 * 事务处理
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
//添加事务注解
    @Transactional
    public void testBookAndAccount(int id,int price) {
        //更新图书库存
        bookDao.testUpdateBook(id);
        //更新资金
        bookDao.testUpdateAccount(id, price);
    }


}
