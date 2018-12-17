package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    private Grid grid = new Grid();
    private Tile tile1 = mock(Tile.class);
    private Tile tile2 = mock(Tile.class);

    @Test
    void shouldReturnAnEmptyListOfTiles() {
        assertTrue(grid.getTiles().isEmpty());
    }

    @Test
    void shouldReturnTileListOfSize2() {
        grid.addToTiles(tile1);
        grid.addToTiles(tile2);
        assertEquals(2,grid.getTiles().size());
    }

}