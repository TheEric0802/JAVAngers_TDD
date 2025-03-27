package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    void getX_shouldReturn0() {
        assertEquals(0, new PlayerCharacter().getX());
    }

    @Test
    void getY_shouldReturn0() {
        assertEquals(0, new PlayerCharacter().getY());
    }

}