package com.llf.spring.day5_13.autowire;

/**
 * Created by lenovo on 2016/5/13.
 */
public class Address {
    private String addName;

    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addName='" + addName + '\'' +
                '}';
    }
}
