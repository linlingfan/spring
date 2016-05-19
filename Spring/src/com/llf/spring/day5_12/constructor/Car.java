package com.llf.spring.day5_12.constructor;

/**
 * Created by lenovo on 2016/5/12.
 * <p/>
 * 验证构造注入
 */
public class Car {
    private String carName;
    private double price;
    private int speed;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

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

    //有参构造器1
    public Car(String carName, double price, int speed) {
        this.carName = carName;
        this.price = price;
        this.speed = speed;
    }
    //有参构造器2

    public Car(String carName, double price) {
        this.carName = carName;
        this.price = price;
    }


    //无参构造器
    public Car(){}


    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
