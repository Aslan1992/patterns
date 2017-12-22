package com.epam.patterns.composite.formal;

public class Client {
    public static void main(String[] args) {

        Component root = new Composite("Root");
        Component leaf = new Leaf("Leaf");
        Composite subtree = new Composite("Subtree");

        root.add(leaf);
        root.add(subtree);
        root.display();
    }
}
