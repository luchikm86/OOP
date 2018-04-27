package com.mluch.oop.courseProject;

import java.time.LocalDateTime;
import java.util.UUID;

public class Account {
    private final String id = UUID.randomUUID().toString();
    private long money;
    private final LocalDateTime dateRegistration;

    public Account(long money, LocalDateTime dateRegistration) {
        if (money < 0) {
            throw new IllegalArgumentException("negative money quantity: " + money);
        }
        this.money = money;
        this.dateRegistration = dateRegistration;
    }

    public long getMoney() {
        return money;
    }

    public LocalDateTime getDateRegistration() {


        return dateRegistration;
    }

    public String getId() {
        return id;
    }

    public long setMoney(long money) {
        return this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", dateRegistration=" + dateRegistration +
                '}';
    }
}