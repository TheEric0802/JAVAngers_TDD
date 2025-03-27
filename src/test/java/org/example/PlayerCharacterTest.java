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

    @Test
    void move_shouldReturn0_1_WhenCalledWithW() {
        assertArrayEquals(new int[]{0, 1}, new PlayerCharacter().move("W"));
    }

    @Test
    void move_shouldReturn0_Negative1_WhenCalledWithS() {
        assertArrayEquals(new int[]{0, -1}, new PlayerCharacter().move("S"));
    }

    @Test
    void move_shouldReturn1_0_WhenCalledWithD() {
        assertArrayEquals(new int[]{1, 0}, new PlayerCharacter().move("D"));
    }

    @Test
    void move_shouldReturnNegative1_0_WhenCalledWithA() {
        assertArrayEquals(new int[]{-1, 0}, new PlayerCharacter().move("A"));
    }

}