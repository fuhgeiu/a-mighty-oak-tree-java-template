package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    @Test
    void getName() {

        Node node1 = new Node("node1");
        Node node2 = new Node("node2");
        Node node3 = new Node("node3");

        assertEquals("node1",node1.getData().getClass().getName());
        assertEquals("node2",node1.getData().getClass().getName());
        assertEquals("node3",node1.getData().getClass().getName());
    }







}