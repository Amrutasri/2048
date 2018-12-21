package controller;

import model.Direction;
import model.Grid;
import model.Tile;

public class Game2048 {

    private Grid grid;

    public Game2048(Grid grid) {
        this.grid = grid;
    }

    public void play(Direction direction) {
        Tile tile = grid.createTile();
        int tileIndex = grid.getIndex(tile);
        for(int index=3; index>0; index--) {
            int moveToIndex =  tileIndex + (direction.move()*index);
            if(grid.isNull(moveToIndex)) {
                grid.slide(tile,tileIndex,moveToIndex);
            }
            else if(grid.equals(moveToIndex,tile)) {
                grid.merge(tile,tileIndex,moveToIndex);
            }
        }
    }
}
