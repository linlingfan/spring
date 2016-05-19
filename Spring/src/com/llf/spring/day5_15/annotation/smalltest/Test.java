package com.llf.spring.day5_15.annotation.smalltest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/15.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_15/annotation/bean-annotation.xml");
        UserAction userAction = ctx.getBean(UserAction.class);
        userAction.execute();

    }
}
