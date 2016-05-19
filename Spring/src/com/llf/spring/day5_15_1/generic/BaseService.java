package com.llf.spring.day5_15_1.generic;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by lenovo on 2016/5/15.
 * 泛型注入
 */
public class BaseService<T> {
    //会被子类继承
    @Autowired
    protected BaseRespository<T> baseRespository;

    public void say(){
        System.out.println("BaseService");
        System.out.println(baseRespository);
    }

}
