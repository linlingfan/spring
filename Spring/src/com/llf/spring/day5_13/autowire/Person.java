package com.llf.spring.day5_13.autowire;
import com.llf.spring.day5_13.autowire.Car;
/**
 * Created by lenovo on 2016/5/13.
 * 测试xml里的bean的自动装配
 */
public class Person {
    private String name;
    private Address address2;
    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress2() {
        return address2;
    }

    public void setAddress2(Address address) {
        this.address2 = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address2 +
                ", car=" + car +
                '}';
    }
}
