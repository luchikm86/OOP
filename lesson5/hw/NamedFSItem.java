package com.mluch.oop.lesson5.hw;

abstract class NamedFSItem implements FSItem{
    private String name;

    public NamedFSItem(String name) {
        this.name = name;
    }

    public NamedFSItem() {
        this.name = "name...";
    }

    @Override
    public String getName() {
        return name;
    }

}
