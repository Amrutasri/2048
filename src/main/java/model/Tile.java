package model;

import java.util.Objects;
import java.util.Random;

public class Tile {

    private int value;

    public Tile() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        value = randomNumberGenerator.generateEitherOfTwoNumbers2And4();
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
