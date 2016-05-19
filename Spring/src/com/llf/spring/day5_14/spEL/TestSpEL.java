package com.llf.spring.day5_14.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/14.
 */
public class TestSpEL {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/llf/spring/day5_14/spEL/bean-spEL.xml");

        Car car= (Car) ctx.getBean("car");
        System.out.println(car);

        Person person= (Person) ctx.getBean("person");
        System.out.println(person);

    }
}
