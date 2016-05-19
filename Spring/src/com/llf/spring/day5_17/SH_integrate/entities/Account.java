package com.llf.spring.day5_17.SH_integrate.entities;

/**
 * Created by lenovo on 2016/5/19.
 */
public class Account {
    private int id;
    private String userName;
    private int balance;//资金

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;

    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
