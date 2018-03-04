package com.mluch.oop.lesson2.hw.Menu;

import java.util.ArrayList;

public class Menu {

    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }
    public Dish getCheapestDish() {
        if (dishes.isEmpty()) {
            throw new  IllegalArgumentException ("negative dish - Empty");
        }
        Dish cheap = dishes.get(0);
        for (Dish dish: dishes) {
            if (dish.getPrice() < cheap.getPrice()) {
                cheap = dish;
            }
        }
        return cheap;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return "Menu " + name +
                " dishes " + dishes;
    }

}
