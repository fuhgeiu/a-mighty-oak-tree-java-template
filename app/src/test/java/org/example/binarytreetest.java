package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class binarytreetest  {

    @Test
    void binarytreetest() {

        Squirrel sqrl1 = new Squirrel("tom");
        Node node1 = new Node(sqrl1);

        Squirrel sqrl2 = new Squirrel("harry");
        Node node2 = new Node(sqrl2);

        Squirrel sqrl3 = new Squirrel("javert");
        Node node3 = new Node(sqrl3);

        Squirrel sqrl4 = new Squirrel("marius");
        Node node4 = new Node(sqrl4);

        Squirrel sqrl5 = new Squirrel("marissa");
        Node node5 = new Node(sqrl5);


        binaryTree tree1 = new binaryTree(node1);       // tree root set as node1

        node1.set_left(node2);
        node1.set_right(node3);

        node2.set_left(node4);
        node4.set_right(node5);

        assertEquals(tree1.root(),node1);

        assertEquals(node1.left(),node2);
        assertEquals(node1.right(),node3);
        assertEquals(node2.left(),node4);
        assertEquals(node4.right(),node5);

    }

}