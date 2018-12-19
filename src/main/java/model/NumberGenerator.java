package model;

import java.util.Random;

public class NumberGenerator {

    public int generateEitherOfTwoNumbers2And4() {
        int maximum = 2, minimum = 1;
        int randomNumber = (int)(Math.random() * ((maximum - minimum) + 1)) + minimum;
        return (int)Math.pow(2,randomNumber);
    }

    public int generateRandomNumberBetweenRange(int maximum, int minimum) {
        return (int)(Math.random() * ((maximum - minimum) + 1)) +minimum;
    }
}
