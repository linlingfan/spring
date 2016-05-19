package com.llf.spring.day5_13.beans_relation;

/**
 * Created by lenovo on 2016/5/14.
 * bean间的依赖关系
 */
public class Person {
    private String name;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Person(){
        System.out.println("person被实例化了！constructor被调用！");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
