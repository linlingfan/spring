package com.llf.spring.day5_13.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/13.
 */
public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_13/autowire/bean-autowrie.xml");
        //测试自动装配
        Person person= (Person) ctx.getBean("person");
        System.out.println(person);


    }
}
