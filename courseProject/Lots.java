package com.mluch.oop.courseProject;

import java.util.ArrayList;

public class Lots {

    private final ArrayList<Lot> lots = new ArrayList<>();

    public void addLot(Lot lot) {
        lots.add(lot);
    }

    public ArrayList<Lot> getLots() {
        return lots;
    }
}
