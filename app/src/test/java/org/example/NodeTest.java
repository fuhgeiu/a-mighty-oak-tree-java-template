package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    @Test
    void getName() {

        Squirrel sqrl1 = new Squirrel("tom");
        Node node1 = new Node(sqrl1);
        Squirrel sqrl2 = new Squirrel("harry");
        Node node2 = new Node(sqrl2);
        Squirrel sqrl3 = new Squirrel("javert");
        Node node3 = new Node(sqrl3);


        assertEquals("tom",node1.getData().getName());
        assertEquals("harry",node2.getData().getName());
        assertEquals("javert",node3.getData().getName());

        Squirrel sqrl4 = new Squirrel("marius");
        Squirrel sqrl5 = new Squirrel("marissa");

        Node node4 = new Node(sqrl4);
        Node node5 = new Node(sqrl5);

        node5.set_left(node3);
        node5.set_right(node2);

        node4.set_left(node1);

        assertEquals(node5.left(),node3);

        assertEquals(node5.left().getData().getName(),node3.getData().getName());
        assertEquals(node5.right().getData().getName(),node2.getData().getName());
        assertEquals(node4.left().getData().getName(),node1.getData().getName());
    }


}