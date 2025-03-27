package org.example;

public class PlayerCharacter {

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int[] move(String input) {

        switch (input) {
            case "W":
                return new int[]{0, 1};
            case "S":
                return new int[]{0, -1};
            default:
                return new int[0];
        }

    }
}
