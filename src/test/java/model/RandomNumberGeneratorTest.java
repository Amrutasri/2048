package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {

    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    @Test
    void shouldGenerateRandomNumberEitherOf2Or4() {
        int number = randomNumberGenerator.generateEitherOfTwoNumbers2And4();
        assertTrue(number==2 || number==4);
    }

    @Test
    void shouldGenerateRandomNumberBetweenSpecifiedRangeSay1And16() {
        int number = randomNumberGenerator.generateNumberBetweenRange(16,1);
        assertTrue((number<=16)&&(number>=1));
    }

    @Test
    void shouldGenerate1AsTheRangeIsFrom1To1() {
        int number = randomNumberGenerator.generateNumberBetweenRange(1,1);
        assertEquals(1, number);
    }

}