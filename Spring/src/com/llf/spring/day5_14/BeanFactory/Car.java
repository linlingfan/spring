package com.llf.spring.day5_14.BeanFactory;

/**
 * Created by lenovo on 2016/5/14.
 * beanfactory的方式配置bean
 */
public class Car {
    private int speed;
    private double price;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(){

    }

    public Car(int speed, double price) {
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", price=" + price +
                '}';
    }
}
