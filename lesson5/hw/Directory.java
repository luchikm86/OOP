package com.mluch.oop.lesson5.hw;

import java.util.ArrayList;
import java.util.List;

class Directory extends NamedFSItem {

    private final List<FSItem> items = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FSItem fsItem) {
        items.add(fsItem);
    }

    @Override
    public int getSize() {
        int sizes = 0;
        for (FSItem item : items) {
            sizes += item.getSize();
        }
        return sizes;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "items=" + items +
                "} " + super.toString();
    }
}
