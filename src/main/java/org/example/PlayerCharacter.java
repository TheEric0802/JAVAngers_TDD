package org.example;

public class PlayerCharacter {

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    public int[] move(String input) {

        return switch (input) {
            case "W" -> new int[]{0, 1};
            case "S" -> new int[]{0, -1};
            case "D" -> new int[]{1, 0};
            case "A" -> new int[]{-1, 0};
            default -> new int[2];
        };

    }
}
