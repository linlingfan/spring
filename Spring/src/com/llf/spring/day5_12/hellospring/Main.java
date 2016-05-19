package com.llf.spring.day5_12.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/12.
 */
public class Main {
    public static void main(String[] args) {
        //1.创建springIOC的容器对象  在创建容器的时候就已经调用类的构造器并对配置的bean初始化，也为set赋值了！其实就是帮你实例化了这个对象。
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从IOC容器中取得bean的实例
        HelloSpring helloSpring= (HelloSpring) ctx.getBean("helloSpring");
//        HelloSpring helloSpring1=ctx.getBean(HelloSpring.class);  前提配置的该Bean是唯一的！如果两个class都是同一个类会报错！
        //3.调用方法
        helloSpring.hello();
//        helloSpring1.hello();
    }
}
