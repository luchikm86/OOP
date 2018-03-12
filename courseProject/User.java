package com.mluch.oop.courseProject;

import java.util.UUID;

public class User {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final Account account;


    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public long getRemainingMoney() {
        return account.getMoney();
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
