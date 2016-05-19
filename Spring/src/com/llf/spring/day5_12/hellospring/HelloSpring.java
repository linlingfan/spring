package com.llf.spring.day5_12.hellospring;

/**
 * Created by lenovo on 2016/5/12.
 */
public class HelloSpring {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("name:" + name);
    }

    public HelloSpring(){
        System.out.println("我是无参构造器，IOC容器调用我了！！！");
    }

}
