package model;

public enum Direction {

    LEFT(4),

    RIGHT(4),

    UP(1),

    DOWN(1);

    private int constant;

    Direction(int constant) {
        this.constant = constant;
    }

    public int move() {
        return constant;
    }
}
