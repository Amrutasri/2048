package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void shouldReturn4AsItIsConstantValueOfLeftToMove() {
        assertEquals(4,Direction.LEFT.move());
    }

    @Test
    void shouldNotReturnAnyOtherNumberOther4AsItIsConstantValueOfLeftToMove() {
        assertFalse((Direction.LEFT.move()<4) || (Direction.LEFT.move()>4));
    }

    @Test
    void shouldReturn4AsItIsConstantValueOfRightToMove() {
        assertEquals(4,Direction.RIGHT.move());
    }

    @Test
    void shouldNotReturnAnyOtherNumberOther4AsItIsConstantValueOfRightToMove() {
        assertFalse((Direction.RIGHT.move()<4) || (Direction.RIGHT.move()>4));
    }

    @Test
    void shouldReturn1AsItIsConstantValueOfUpToMove() {
        assertEquals(1, Direction.UP.move());
    }

    @Test
    void shouldNotReturnAnyOtherNumberOther1AsItIsConstantValueOfUpToMove() {
        assertFalse((Direction.UP.move()<1) || (Direction.UP.move()>1));
    }

    @Test
    void shouldReturn1AsItIsConstantValueOfDownToMove() {
        assertEquals(1,Direction.DOWN.move());
    }

    @Test
    void shouldNotReturnAnyOtherNumberOther1AsItIsConstantValueOfDOwnToMove() {
        assertFalse((Direction.DOWN.move()<1) || (Direction.DOWN.move()>1));
    }
}