package com.mluch.oop.courseProject;

import java.time.LocalDateTime;

public class Rate {
    private long currentPrice;
    private final UserBuyer userBuyer;
    private final LocalDateTime currentTimeRate;
    private final Lot lot;

    public Rate(long currentPrice, UserBuyer userBuyer, LocalDateTime currentTimeRate, Lot lot) {
        this.currentPrice = currentPrice;
        this.userBuyer = userBuyer;
        this.currentTimeRate = currentTimeRate;
        this.lot = lot;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public UserBuyer getUserBuyer() {
        return userBuyer;
    }

    public LocalDateTime getCurrentTimeRate() {
        return currentTimeRate;
    }

    public long changeCurrentPrice (long newRate) {
        if (newRate <= currentPrice) {
            throw new IllegalArgumentException("Rate is small then current: " + newRate);
        }
//        if (lot.getUserSeller().equals(userBuyer)) {
//            // подумать как сделать и нужно ли оно
//        }

        currentPrice = newRate;
        return newRate;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currentPrice=" + currentPrice +
                ", userBuyer=" + userBuyer +
                ", currentTimeRate=" + currentTimeRate +
                '}';
    }
}
