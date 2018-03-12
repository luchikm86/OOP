package com.mluch.oop.lesson3.hw.menu;

/**
 * @author bvanchuhov
 */
public class Dish {

    private final String name;
    private final String description;
    private final long price;

    public Dish(String name, String description, long price) {
        if (price < 0) {
            throw new IllegalArgumentException("negative price: " + price);
        }

        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
