package com.mluch.oop.lesson5.hw;

public class FSRunner {
    public static void main(String[] args) {

        NamedFSItem file1 = new File("doc.doc", 10);
        NamedFSItem file2 = new File("list.xml", 15);
        NamedFSItem file3 = new File("game.exe", 32);

        Directory dir1 = new Directory("documents");
        Directory dir2 = new Directory("games");

        FSItem slink1 = new Symlink("symlink1", file1);
        FSItem slink2 = new Symlink("symlink2", file3);

        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        System.out.println("documents: " + dir1.getSize());
        System.out.println("games: " + dir2.getSize());

        System.out.println("symlink1: " + slink1.getName());
        System.out.println("symlink2: " + slink2.getName());



    }
}
