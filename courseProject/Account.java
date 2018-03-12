package com.mluch.oop.courseProject;

import java.time.LocalDate;

public class Account {
    private final long money;
    private final LocalDate dateRegistration;

    public Account(long money, LocalDate dateRegistration) {
        if (money < 0) {
            throw new IllegalArgumentException("negative money quantity: " + money);
        }
        this.money = money;
        this.dateRegistration = dateRegistration;
    }

    public long getMoney() {
        return money;
    }

    public LocalDate getDateRegistration() {
        return dateRegistration;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", dateRegistration=" + dateRegistration +
                '}';
    }
}
