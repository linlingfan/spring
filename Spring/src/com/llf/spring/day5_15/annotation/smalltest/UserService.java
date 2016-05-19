package com.llf.spring.day5_15.annotation.smalltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/5/15.
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add(){
        System.out.println("添加新用户！");
        userDao.save();
    }

}
