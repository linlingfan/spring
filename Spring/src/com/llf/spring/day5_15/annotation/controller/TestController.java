package com.llf.spring.day5_15.annotation.controller;

import com.llf.spring.day5_15.annotation.component.TestComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by lenovo on 2016/5/15.
 * Controller 的使用
 * 标识表现层组件
 */

@Controller
public class TestController {
    @Autowired(required = false)
    private TestComponent component;
    public void add(){
        System.out.println("TestController add()...");
        System.out.println(component);
    }
}
