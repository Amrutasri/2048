package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    private NumberGenerator numberGenerator = new NumberGenerator();

    @Test
    void shouldGenerateRandomNumberEitherOf2Or4() {
        int number = numberGenerator.generateEitherOfTwoNumbers2And4();
        assertTrue(number==2 || number==4);
    }

    @Test
    void shouldNotGenerateRandomNumberNeitherOf2Or4() {
        int number = numberGenerator.generateEitherOfTwoNumbers2And4();
        assertFalse((number!=2) && (number!=4));
    }

    @Test
    void shouldGenerateRandomNumberBetweenSpecifiedRangeSay1And16() {
        int number = numberGenerator.generateRandomNumberBetweenRange(16,1);
        assertTrue((number<=16)&&(number>=1));
    }

    @Test
    void shouldGenerate1AsTheRangeIsFrom1To1() {
        int number = numberGenerator.generateRandomNumberBetweenRange(1,1);
        assertEquals(1, number);
    }

    @Test
    void shouldNotGenerateAnyNumberWhichIsNotSpecifiedInRange() {
        int number = numberGenerator.generateRandomNumberBetweenRange(16,1);
        assertFalse((number>16) && (number<1));
    }
}