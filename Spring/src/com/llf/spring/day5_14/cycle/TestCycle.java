package com.llf.spring.day5_14.cycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/14.
 */
public class TestCycle {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_14/cycle/bean-cycle.xml");
        Car car= (Car) ctx.getBean("car");
        System.out.println(car);
        //关闭容器 为什么没有close的方法
    }
}
