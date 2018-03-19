package com.mluch.oop.courseProject;

import java.time.LocalDateTime;
import java.util.Arrays;

public class OnlineAuctionRunner {

    public static void main(String[] args) {

        Account account1 = new Account(1000, LocalDateTime.now());
        Account account2 = new Account(2000, LocalDateTime.now());
        System.out.println();

        System.out.println(account1.getDateRegistration());
        System.out.println(account1.getMoney());
        System.out.println();

        UserBuyer userBuyer = new UserBuyer("Max", account1);
        UserSeller userSeller = new UserSeller("Sergey", account2);
        System.out.println(userBuyer.getRemainingMoney());
        System.out.println(userBuyer.getId());


        System.out.println();


        Account account = new Account(1000, LocalDateTime.now());
        System.out.println(account.toString());
        System.out.println(account.getDateRegistration());
        System.out.println(account.getMoney());




        ProductCategory productCategory = ProductCategory.technique;
        if (productCategory == ProductCategory.technique) productCategory = ProductCategory.electronics;
        System.out.println(productCategory);
        System.out.println(ProductCategory.class.getSuperclass());
        System.out.println(Arrays.toString(ProductCategory.values()));

    }


}
