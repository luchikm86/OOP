package com.mluch.oop.courseProject;

public class Trade {
    private final long id;
    private final long currentRate;
    private final long startTime;
    private final long endTime;

    public Trade(long id, long currentRate, long startTime, long endTime) {
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

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
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
