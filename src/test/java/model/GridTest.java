package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    private Grid grid = new Grid();
    private Tile tile1 = mock(Tile.class);

    @Test
    void shouldUpdateTilesWithTile1ToTheSpecifiedIndex1() {
        grid.updateTiles(tile1,1);
        assertTrue(grid.consists(tile1));
    }

    @Test
    void shouldNotUpdateTilesWithTile1ToIndex2AsSpecifiedIndexIs1() {
        assertFalse(grid.consists(tile1));
    }
}