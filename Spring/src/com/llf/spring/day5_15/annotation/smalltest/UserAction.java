package com.llf.spring.day5_15.annotation.smalltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by lenovo on 2016/5/15.
 */

@Controller
public class UserAction {
    @Autowired
    private UserService userService;

    public void execute() {
        System.out.println("接受请求");
        userService.add();
    }

}
