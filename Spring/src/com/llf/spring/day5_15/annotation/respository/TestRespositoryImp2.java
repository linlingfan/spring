package com.llf.spring.day5_15.annotation.respository;

import org.springframework.stereotype.Repository;

/**
 * Created by lenovo on 2016/5/15.
 */

@Repository
public class TestRespositoryImp2 implements TestRespository {

    @Override
    public void delete() {
        System.out.println("TestRespositoryImp2delete()...");
    }
}
