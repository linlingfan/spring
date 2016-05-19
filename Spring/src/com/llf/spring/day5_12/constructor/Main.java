package com.llf.spring.day5_12.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/12.
 * 测试构造器注入
 */
public class Main {
    public static void main(String[] args) {
        //创建IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/llf/spring/day5_12/constructor/applicationContext1.xml");
        Car car1= (Car) ctx.getBean("car1");
        System.out.println(car1);
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);
        //测试引用Bean
//        Person person= (Person) ctx.getBean("person");
//        System.out.println(person);
        //内部bean测试
//        Person person2 = (Person) ctx.getBean("person2");
//        System.out.println(person2);
        //测试list集合bean
//        NewPerson newPerson1= (NewPerson) ctx.getBean("newPerson1");
//        System.out.println(newPerson1);
        //测试map集合bean
//        NewPerson newPerson= (NewPerson) ctx.getBean("newPerson");
//        System.out.println(newPerson);
        //测试下properties
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
        //测试下bean之间共享的集合
        NewPerson newPerson3 = (NewPerson) ctx.getBean("newPerson3");
        System.out.println(newPerson3);
        //p命名的测试
        Person person3= (Person) ctx.getBean("person3");
        System.out.println(person3);

    }


}
