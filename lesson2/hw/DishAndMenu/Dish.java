package com.mluch.oop.lesson2.hw;

public class Dish {

    private final String name;
    private final String description;
    private final long price;

    public Dish(String name, String description, long price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return getDescription();
    }
    public long getPrice() {
        return price;
    }
    public String toString() {
        return "Dish " + name +
                " price " + price +
                "{description - " + description +
                " }";
    }

}
