package com.llf.spring.day5_15.annotation.component;

import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2016/5/15.
 * Component注解的使用
 * 基本注解, 标识了一个受 Spring 管理的组件
 */

@Component
public class TestComponent {
    public void say(){
        System.out.println("TestComponent say()...");
    }
}
