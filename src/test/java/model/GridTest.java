package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    private Grid grid = new Grid();
    private Tile tile1 = mock(Tile.class);

    @Test
    void shouldUpdateTilesWithTile1() {
        grid.updateTiles(tile1,1);
        assertTrue(grid.consists(tile1));
    }

    @Test
    void shouldNotUpdateTilesWithTile1AsItIsNotUpdated() {
        assertFalse(grid.consists(tile1));
    }

    @Test
    void shouldReturnIndexAs2AsTile1IsUpdatedWithIndex2() {
        grid.updateTiles(tile1,2);
        assertEquals(2,grid.getIndex(tile1));
    }

    @Test
    void shouldNotReturnIndexAs1AsTileIsUpdatedWithIndex2() {
        grid.updateTiles(tile1,2);
        assertNotEquals(1,grid.getIndex(tile1));
    }
}