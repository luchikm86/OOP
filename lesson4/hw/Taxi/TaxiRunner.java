package com.mluch.oop.lesson4.hw.Taxi;

public class TaxiRunner {

    public static void main(String[] args) {

        Tariff standardTariff = new StandardTariff();
        Tariff familyTariff = new FamilyTariff();

        Ride ride1 = new Ride(3, 15, 20, standardTariff);
        Ride ride2 = new Ride(2, 20, 5, familyTariff);

        System.out.println(ride1.getPrice());
        System.out.println(ride2.getPrice());

        RidesHistory history1 = new RidesHistory();

        history1.addRide(ride1);
        history1.addRide(ride2);

        System.out.println(history1.getTotalPrice());

    }
}


//145
//250
//395