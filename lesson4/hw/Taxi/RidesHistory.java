package com.mluch.oop.lesson4.hw.Taxi;

import java.util.ArrayList;

public class RidesHistory {

    private final ArrayList<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long totalPrice = 0;
        for (Ride ride : rides) {
            totalPrice += ride.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "rides=" + rides +
                '}';
    }
}