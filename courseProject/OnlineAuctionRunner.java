package com.mluch.oop.courseProject;

import java.time.LocalDate;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account = new Account(1000, LocalDate.now());
        System.out.println(account.toString());
        System.out.println(account.getDateRegistration());
        System.out.println(account.getMoney());

    }


}
