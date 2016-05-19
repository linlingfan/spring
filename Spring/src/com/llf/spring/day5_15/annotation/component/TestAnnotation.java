package com.llf.spring.day5_15.annotation.component;

import com.llf.spring.day5_15.annotation.controller.TestController;
import com.llf.spring.day5_15.annotation.respository.TestRespositoryImp;
import com.llf.spring.day5_15.annotation.service.UserServiceImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/15.
 */
public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("com/llf/spring/day5_15/annotation/bean-annotation.xml");

        TestComponent testComponent = (TestComponent) ctx.getBean("testComponent");
        testComponent.say();

        TestRespositoryImp testRespository= (TestRespositoryImp) ctx.getBean("testRespositoryImp");
        testRespository.delete();

        UserServiceImp userServiceImp= (UserServiceImp) ctx.getBean("userServiceImp");
        userServiceImp.save();

        TestController testController= (TestController) ctx.getBean("testController");
        testController.add();

    }
}
