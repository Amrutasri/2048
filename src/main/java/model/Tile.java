package model;

import java.util.Objects;

public class Tile {

    private int value;

    public Tile() {
        NumberGenerator numberGenerator = new NumberGenerator();
        value = numberGenerator.generateEitherOfTwoNumbers2And4();
    }

    public void updateValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Tile tile = (Tile) object;
        return value == tile.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
