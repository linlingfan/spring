package com.llf.spring.day5_15_1.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2016/5/15.
 */
public class TestAop {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/llf/spring/day5_15_1/aop/bean-aop.xml");

//        ArithmeticCalculator arithmeticCalculator= (ArithmeticCalculator) ctx.getBean(ArithmeticCalculator.class);

/**
 *      动态代理 proxy只能代理接口类 所以是有实现类会出现异常
 *       com.sun.proxy.$Proxy7 cannot be cast to com.llf.spring.day5_15_1.aop.ArithmeticCalculatorImp的异常
 *      cglib 可以代理非接口类！要导包。。。
 */
        ArithmeticCalculatorImp arithmeticCalculatorImp = (ArithmeticCalculatorImp) ctx.getBean(ArithmeticCalculator.class);
//        ArithmeticCalculatorImp arithmeticCalculatorImp=new ArithmeticCalculatorImp();
        int result = arithmeticCalculatorImp.add(1, 1);
        System.out.println(result);

//        System.out.println(arithmeticCalculator.getClass().getName());
//        int result = arithmeticCalculator.add(1, 1);
//        System.out.println(result);
//
//        int result1=arithmeticCalculator.del(1000,10);
//        System.out.println(result1);

        //
//        UserServiceImp userServiceImp= (UserServiceImp) ctx.getBean(UserService.class);
//        userServiceImp.say();

    }
}
