package com.llf.spring.day5_15.annotation.smalltest;

import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2016/5/15.
 */

@Repository
public class UserDao {
    public void save(){
        System.out.println("保存用户信息！");

    }
}
