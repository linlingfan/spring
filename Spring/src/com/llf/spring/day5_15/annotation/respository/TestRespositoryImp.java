package com.llf.spring.day5_15.annotation.respository;

import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2016/5/15.
 * Repository 注解的使用 持久层
 */

@Repository
public class TestRespositoryImp implements TestRespository {
    public void delete(){
        System.out.println("TestRespository delete()...");
    }
}
