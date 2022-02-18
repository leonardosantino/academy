package com.capgemini;

import com.capgemini.challenges.Stair;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StairTest {

    private final Stair stair = new Stair();

    @Test
    @DisplayName("Stair steps = 3")
    void buildStair() {
        assertEquals("""
                  *
                 **
                ***""", stair.buildStair(3));
    }

    @Test
    @DisplayName("Stair steps = 1")
    void buildStair1() {
        assertEquals("*", stair.buildStair(1));
    }

    @Test
    @DisplayName("Stair steps = 0")
    void buildStair2() {
        assertEquals("", stair.buildStair(0));
    }

    @Test
    @DisplayName("Stair steps = -1")
    void buildStair3() {
        assertEquals("", stair.buildStair(-1));
    }
}