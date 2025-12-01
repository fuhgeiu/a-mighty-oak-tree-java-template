package org.example;

public class Node  {

    private Squirrel data;
    private Node left;
    private Node right;


    Node(Squirrel data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }

    void set_left(Node child) {left = child;}

    void set_right(Node child) {right = child;}

    Node left() { return left; }
    Node right() { return right; }

    Squirrel getData() { return data; }
}