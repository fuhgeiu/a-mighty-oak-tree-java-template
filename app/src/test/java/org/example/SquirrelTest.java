package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquirrelTest {

    @Test
    public void testSquirrel() {

        Squirrel squirrel1 = new Squirrel("tom");
        Squirrel squirrel2 = new Squirrel("harry");
        Squirrel squirrel3 = new Squirrel("javert");
        Squirrel squirrel4 = new Squirrel("harry");

        assertEquals(squirrel1.getName(),"tom");
        assertEquals(squirrel2.getName(),"harry");
        assertEquals(squirrel3.getName(),"javert");

        assertEquals(squirrel4.getName(),squirrel2.getName());

    }

}