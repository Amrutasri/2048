package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GridTest {

    private Grid grid = new Grid();
    private Tile tile1 = mock(Tile.class);
    private Tile tile2 = mock(Tile.class);

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

    @Test
    void shouldCreateNewTileWithAnyIndexBetween0And15() {
        Tile tile = grid.createTile();

        assertTrue(((grid.getIndex(tile))>=0) && ((grid.getIndex(tile))<16));
    }

    @Test
    void shouldReturnTrueAsThereIsNoTilePresentInIndex5() {
        assertTrue(grid.isNull(5));
    }

    @Test
    void shouldReturnFalseAsThereIsTilePresentInIndex5() {
        grid.updateTiles(tile1,6);

        assertFalse(grid.isNull(6));
    }

    @Test
    void shouldBeTrueAsTile1IsEqualToTheSameTile1IsAddedToGridWithIndex4() {
        grid.updateTiles(tile1,4);

        assertTrue(grid.equals(4,tile1));
    }

    @Test
    void shouldBeFalseAsTile1WithIndex2IsNotEqualToTheTileWithIndex3() {
        grid.updateTiles(tile1,2);

        assertFalse(grid.equals(3,tile1));
    }

    @Test
    void shouldNotEqualTile1AsItCreatesAndReturnsNewTile() {
        assertNotEquals(tile1,grid.createTile());
    }

    @Test
    void shouldSlideTheGivenTileFromItsIndexToTheGivenIndex() {
        grid.slide(tile1,1,3);

        assertEquals(3,grid.getIndex(tile1));
    }

    @Test
    void shouldNotSlideTheGivenTileFromItsIndexToAnotherIndexOtherThanTheSpecifiedIndex() {
        grid.slide(tile1,3,1);

        assertNotEquals(2,grid.getIndex(tile1));
    }

    @Test
    void shouldMergeTheTileWithIndex1WithAnotherTileWithIndex2() {
        grid.updateTiles(tile1,1);
        grid.updateTiles(tile2,2);

        grid.merge(tile1,1,2);

        assertTrue(grid.isNull(1));
    }

    @Test
    void shouldNotLeaveTheTileBehindInPreviousIndexAfterMergingTile1WithIndex2ToIndex1Tile() {
        grid.updateTiles(tile1,2);
        grid.updateTiles(tile2,1);

        grid.merge(tile1,2,1);

        assertTrue(grid.isNull(2));
    }

    @Test
    void shouldNotMergeTile1WithIndex1ToAnyOtherIndexTileOtherThanSpecifiedIndex2() {
        grid.updateTiles(tile1,1);
        grid.updateTiles(tile2,2);

        grid.merge(tile1,1,2);

        assertNotEquals(3,grid.getIndex(tile1));
    }
}