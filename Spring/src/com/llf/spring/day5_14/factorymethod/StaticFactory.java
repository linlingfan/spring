package com.llf.spring.day5_14.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/14.
 * 测试静态工厂
 */
public class StaticFactory {
    private static Map<String, Car> carMap = new HashMap<String, Car>();

    static {
        carMap.put("audi", new Car(270, 1000000));
        carMap.put("BMW", new Car(300, 1200000));
    }
//静态工厂方法
    public static Car getCar(String carName){
        return carMap.get(carName);

    }

}
