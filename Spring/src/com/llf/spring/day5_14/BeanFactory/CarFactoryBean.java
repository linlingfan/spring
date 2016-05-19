package com.llf.spring.day5_14.BeanFactory;

import org.springframework.beans.factory.FactoryBean;

/**
 * Created by lenovo on 2016/5/14.
 */
public class CarFactoryBean implements FactoryBean<Car> {

    //FactoryBean也可以定义属性
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //返回一个bean的对象
    @Override
    public Car getObject() throws Exception {

        return new Car(speed,300000);
    }

    //返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    //是否为单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
