package com.mluch.oop.lesson4.hw.Taxi;

public class FamilyTariff implements Tariff{

    @Override
    public long calculatePrice(Ride ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
