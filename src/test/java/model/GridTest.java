package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    Grid grid = new Grid();

    @Test
    void shouldReturnAnEmptyListOfTiles() {
        assertTrue(grid.getTiles().isEmpty());
    }

}