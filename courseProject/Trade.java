package com.mluch.oop.courseProject;

import java.time.LocalDateTime;

public class Trade {
    private final long id;
    private final long currentRate;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public Trade(long id, long currentRate, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = id;
        this.currentRate = currentRate;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getId() {
        return id;
    }

    public long getCurrentRate() {
        return currentRate;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id=" + id +
                ", currentRate=" + currentRate +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
