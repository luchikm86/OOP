package com.mluch.oop.lesson2.hw.Menu;

public class MenuRunner {

    public static void main(String[] args) {
        Menu firstMenu = new Menu("First meal");

        Dish dishFirstMenu1 = new Dish("Ukrainian Borsch",
                "Ukrainian Borsch served with buns, meat and green onion", 54);
        Dish dishFirstMenu2 = new Dish("Fish soup", "Fish soup of carp", 50);
        Dish dishFirstMenu3 = new Dish("Mushroom cream soup", "Creamy Mushroom Soup", 44);

        firstMenu.addDish(dishFirstMenu1);
        firstMenu.addDish(dishFirstMenu2);
        firstMenu.addDish(dishFirstMenu3);

        Menu secondMenu = new Menu("Hot snacks");

        Dish dishsecondMenu1 = new Dish("\"Varenyky\" original Ukrainian",
                "Ravioli with meat ", 52);
        Dish dishsecondMenu2 = new Dish("Potato pancakes", "With sour cream", 46);
        Dish dishsecondMenu3 = new Dish("Fried white mushrooms",
                "In a homemade sour cream sauce", 62);

        secondMenu.addDish(dishsecondMenu1);
        secondMenu.addDish(dishsecondMenu2);
        secondMenu.addDish(dishsecondMenu3);

        System.out.println(firstMenu.getCheapestDish().toString());
        System.out.println(secondMenu.getCheapestDish().toString());

    }
}
