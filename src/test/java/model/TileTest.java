package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TileTest {

    private Tile tile1 = new Tile();
    private Tile tile2 = new Tile();

    @Test
    void shouldEqualTheTileWithItself() {
        assertEquals(tile1,tile1);
    }

    @Test
    void shouldEqualAnotherWithSameValue() {
        tile2.updateValue(tile1.getValue());
        assertEquals(tile1,tile2);
    }

    @Test
    void shouldNotEqualTile1WithValue2AndTile2WithValue3() {
        tile1.updateValue(2);
        tile2.updateValue(3);
        assertNotEquals(tile1,tile2);
    }

    @Test
    void shouldUpdateTheValueTo3() {
        tile1.updateValue(3);
        assertEquals(3, tile1.getValue());
    }

    @Test
    void shouldReturnTheValue4WhichIsUpdated() {
        tile1.updateValue(4);
        assertEquals(4, tile1.getValue());
    }

    @Test
    void shouldNotEqualTheValueWhenNotUpdated4() {
        assertNotEquals(5,tile1.getValue());
    }
}