package controller;

import model.Collision;
import model.Direction;
import model.Grid;
import model.Tile;

public class Game2048 {

    private Grid grid;

    private int Score = 0;

    public Game2048(Grid grid) {
        this.grid = grid;
    }

    public void play(Direction direction) {
        int highestTileValue;

        Tile tile = grid.createTile();
        int tileIndex = grid.getIndex(tile);

        for(int index=3; index>0; index--) {
            int moveToIndex =  tileIndex + (direction.move()*index);
            if(grid.isNull(moveToIndex)) {
                Collision.Slide.implement(tile,tileIndex,moveToIndex,grid);
            }
            else if(grid.equals(moveToIndex,tile)) {
                Collision.Merge.implement(tile,tileIndex,moveToIndex,grid);
                //highestTileValue = grid.merge(tile,tileIndex,moveToIndex)
                //Score = Score + highestTileValue;
            }
        }
    }
}
