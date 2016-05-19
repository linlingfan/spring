package com.llf.spring.day5_15_1.generic;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/15.
 */
public class TestGeneric {
    public static void main(String[] args) {
        ApplicationContext ctx =new ClassPathXmlApplicationContext("com/llf/spring/day5_15_1/generic/bean-generic.xml");

        UserService userService= (UserService) ctx.getBean("userService");
        userService.say();
    }
}
