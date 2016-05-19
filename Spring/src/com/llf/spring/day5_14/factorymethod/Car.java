package com.llf.spring.day5_14.factorymethod;

/**
 * Created by lenovo on 2016/5/14.
 * BeanFactory的使用
 */
public class Car {
    private int speed;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
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
