package controller;

import model.Direction;
import model.Grid;
import model.Tile;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class Game2048Test {

    private Grid grid = mock(Grid.class);
    private Game2048 game2048 = new Game2048(grid);

    @Test
    void shouldUpdateGridWithNewValue4IfTwoTilesAreSame() {
        Tile tile = new Tile();
        game2048.play();
        tile.updateValue(4);
        verify(grid).consists(tile);
    }
}
