package com.llf.spring.day5_15_1.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/5/15.
 */

@Component
public class ArithmeticCalculatorImp implements ArithmeticCalculator {
    @Override
    public int add(int i, int j) {

        int result = i + j;
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    @Override
    public int del(int i, int j) {
        int result = i / j;
        return result;
    }
}
