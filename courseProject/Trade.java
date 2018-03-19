package com.mluch.oop.courseProject;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Trade {
    private final String id = UUID.randomUUID().toString();;
    private final Rate rate;
    private final Lot lot;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;
    private final List<Rate> ratesHistiry = new ArrayList<>();

    public Trade(Rate rate, Lot lot, LocalDateTime startTime, LocalDateTime endTime) {
        this.rate = rate;
        this.lot = lot;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public Rate getRate() {
        return rate;
    }

    public Lot getLot() {
        return lot;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public List<Rate> addRate() {
        checkTimeOut();
        ratesHistiry.add(rate);
        return ratesHistiry;
    }

    public boolean checkTimeOut() {
        if (rate.getCurrentTimeRate().isAfter(endTime)) {
            System.out.println("Sorry");
            checkWinner();
        }
        return true;
    }

    public UserBuyer checkWinner() {
        int winn = ratesHistiry.lastIndexOf(ratesHistiry);
        Rate Winner = ratesHistiry.get(winn);
        UserBuyer Winnerr = Winner.getUserBuyer();
        return Winnerr;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", rate=" + rate +
                ", lot=" + lot +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
