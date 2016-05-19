package com.llf.spring.day5_14.BeanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/14.
 */
public class TestFactoryBean {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_14/BeanFactory/bean-factorybean.xml");
        Car car= (Car) ctx.getBean("car");
        System.out.println(car);


    }

}
