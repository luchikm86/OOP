package com.mluch.oop.lesson5.hw;

class File extends NamedFSItem{

    private int size;

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "File{" +
                "name=" + getName() +
                "size=" + size +
                '}';
    }
}
