package com.llf.spring.day5_14.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/14.
 */
public class TestFactory {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/llf/spring/day5_14/factorymethod/bean-factorymethod.xml");
        //测试静态工厂方法
        Car car1= (Car) ctx.getBean("car1");
        System.out.println(car1);

        //测试实例工厂方法来配置的bean
        Car car2= (Car) ctx.getBean("car2");
        System.out.println(car2);


    }
}
