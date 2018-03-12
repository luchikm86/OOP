package com.mluch.oop.courseProject;

public class Lot {
    private final long id;
    private final String name;
    private final String category;
    private final long startingPrice;
    private final long currentPrice;
    private final String description;

    public Lot(long id, String name, String category, long startingPrice, long currentPrice, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.startingPrice = startingPrice;
        this.currentPrice = currentPrice;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public long getStartingPrice() {
        return startingPrice;
    }

    public long getCurrentPrice() {
        return currentPrice;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", startingPrice=" + startingPrice +
                ", currentPrice=" + currentPrice +
                ", description='" + description + '\'' +
                '}';
    }
}
