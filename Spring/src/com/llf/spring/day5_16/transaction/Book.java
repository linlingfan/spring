package com.llf.spring.day5_16.transaction;

/**
 * Created by lenovo on 2016/5/16.
 */

public class Book {
    private int id;
    private int num;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", num=" + num +
                '}';
    }
}
