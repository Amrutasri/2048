package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CollisionTest {

    private Tile tile1 = mock(Tile.class);
    private Grid grid = mock(Grid.class);

    @Test
    void shouldSlideTheGivenTileFromItsIndexToTheGivenIndex() {
        Collision.Slide.implement(tile1,1,3,grid);
        verify(grid).updateTiles(tile1,3);
    }

    @Test
    void shouldNotSlideTheGivenTileFromItsIndex3ToAnotherIndexOtherThanTheSpecifiedIndex1() {
        Collision.Slide.implement(tile1,3,1,grid);
        verify(grid,times(0)).updateTiles(tile1,2);
    }

    @Test
    void shouldMergeTheTileWithIndex1WithAnotherTileWithIndex2() {
        Collision.Merge.implement(tile1,1,2,grid);
        verify(grid).updateTiles(tile1,2);
    }

    @Test
    void shouldNotMergeTile1WithIndex1ToAnyOtherIndexTileOtherThanSpecifiedIndex2() {
        Collision.Merge.implement(tile1,1,2,grid);
        verify(grid,times(0)).updateTiles(tile1,3);
    }
}