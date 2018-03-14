package com.mluch.oop.lesson4.account;

/**
 * @author bvanchuhov
 */
public class AccountRunner {

    public static void main(String[] args) {
        Product macBook = new Product("MacBook", 2000);
        FakeAccount account = new FakeAccount(10000);

//        UserBuyer vasya = new UserBuyer("Vasya", new VisaAccount());
//        vasya.payForProduct(macBook);
    }
}
