package com.llf.spring.day5_12.constructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/12.
 * 测试 引用集合bean
 * List和Map
 */
public class NewPerson {
    private String name;
    private int age;
    private List<Car> carList = new ArrayList<Car>();
//    private Map<String, Car> carMap;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    //    public Map<String, Car> getCarMap() {
//        return carMap;
//    }
//
//    public void setCarMap(Map<String, Car> carMap) {
//        this.carMap = carMap;
//    }

    @Override
    public String toString() {
        return "NewPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", carList=" + carList +
                '}';
    }
}
