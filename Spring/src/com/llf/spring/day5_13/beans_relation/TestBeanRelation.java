package com.llf.spring.day5_13.beans_relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/13.
 */
public class TestBeanRelation {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_13/beans_relation/bean-relation.xml");

        //父类bean
//        Car car= (Car) ctx.getBean("car");
//        System.out.println(car);
        //继承父类的bean
//        Car car1= (Car) ctx.getBean("car1");
//        System.out.println(car1);
        //父bean为抽象bean时，继承父bean的子bean 声明class，继承了父bean里的属性，属性也可重新赋值
        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);
        //测试bean的依赖关系
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
        //测试bean的作用域
        Person person1= (Person) ctx.getBean("person2");
        Person person2= (Person) ctx.getBean("person2");//被再次请求，再次创建一个新的bean
        System.out.println(person1);
    }
}
