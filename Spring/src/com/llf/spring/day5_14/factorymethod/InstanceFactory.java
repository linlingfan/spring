package com.llf.spring.day5_14.factorymethod;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2016/5/14.
 * 实例工厂方法 ：就是要创建工厂本身，然后实例化该工厂，再去调用工厂的实例方法来返回bean
 */
public class InstanceFactory {
    private Map<String, Car> carMap = null;

    public InstanceFactory(){
        carMap=new HashMap<String, Car>();
        carMap.put("bieke", new Car(320,3000000));
        carMap.put("audi", new Car(300,260000));
    }
    //创建一个方法
    public Car getCar(String carName){
        return carMap.get(carName);
    }

}
