package org.example;

public class binaryTree {

    private Node root;

    binaryTree (Node root) {
        this.root = root;
    }

    Node root() {return this.root;}

    void traverse(Node node) {

        if (node == null) return;

        System.out.println(node.getData().getClass().getName());
        traverse(node.left());
        traverse(node.right());
    }
}