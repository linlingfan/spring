package com.llf.spring.day5_14.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by lenovo on 2016/5/14.
 */
public class MyPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+ bean + beanName);
        //检查 Bean 属性的正确性或根据特定的标准更改 Bean 的属性
        if (bean.equals("car")){

        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization" + bean + beanName);
            Car car = new Car();
            car.setCarName("hhhh");
        return car;  //可以修改返回新的bean
//        return bean;
    }
}
