package org.example;

public class Node <T> {

    private T data;
    private Node <T> left;
    private Node <T> right;


    Node(T data) {

        this.data = data;
        this.left = null;
        this.right = null;
    }

    void set_left(Node <T> child) {left = child;}

    void set_right(Node <T> child) {right = child;}

    Node left() { return left; }
    Node right() { return right; }

    T getData() { return data; }
}