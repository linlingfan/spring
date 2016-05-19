package com.llf.spring.day5_15.annotation.service;

import com.llf.spring.day5_15.annotation.respository.TestRespository;
import com.llf.spring.day5_15.annotation.respository.TestRespositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/5/15.
 * Service的使用
 * 标识服务层(业务层)组件
 *
 * 基于注解来装配bean属性
 */
//也可以使用value重新命名该bean的id
@Service
public class UserServiceImp implements UserService {
    //基于注解来装配bean属性  ()
//    @Autowired(required = false)

    @Autowired(required = false)
    private TestRespositoryImp testRespository;

    @Autowired(required = false)
    public void setTestRespository(TestRespositoryImp testRespository) {
        this.testRespository = testRespository;
    }

    //也可以在set里使用  当有set是接口类型，而且有多个实现接口的类时候，
    // 对此set方法的 @Autowired默认bean的名字是接口名，
    // 所以要在实现这个借口的类的注解上声明bean的名字如
    // （直接声明为该接口名如在TestRespository声明名字为TestRespository）


    @Override
    public void save() {
        System.out.println("UserServiceImp save()...");
        System.out.println(testRespository);
    }
}
