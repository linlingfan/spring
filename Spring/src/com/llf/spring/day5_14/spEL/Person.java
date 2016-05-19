package com.llf.spring.day5_14.spEL;

/**
 * Created by lenovo on 2016/5/14.
 * bean的spEL表达式
 */
public class Person {
    private String name;
    private Car car;
    private String info;//根据car的price确定info
    private int speed;//根据car的speed属性确定

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", info='" + info + '\'' +
                ", speed=" + speed +
                '}';
    }
}
