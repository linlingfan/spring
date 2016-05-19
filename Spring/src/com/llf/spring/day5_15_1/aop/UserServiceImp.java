package com.llf.spring.day5_15_1.aop;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2016/5/17.
 */
@Component
public class UserServiceImp implements UserService {
    @Override
    public void say() {
        System.out.println("hello sb!");
    }
}
