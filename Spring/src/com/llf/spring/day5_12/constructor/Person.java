package com.llf.spring.day5_12.constructor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 2016/5/12.
 * 测试 引用其他的Bean  （car）
 *
 */
public class Person {
    private String userName;
    private Car car;
    private int age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", car=" + car +
                ", age=" + age +
                '}';
    }
}
