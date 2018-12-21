package model;

public enum Collision {

    Merge {
        @Override
        public void implement(Tile tile, int tileIndex, int moveToIndex, Grid grid) {
            grid.updateTiles(tile, moveToIndex);
            grid.updateTiles(null, tileIndex);
        }
    },

    Slide {
        @Override
        public void implement(Tile tile, int tileIndex, int moveToIndex, Grid grid) {
            tile.updateValue(tile.getValue() + tile.getValue());
            grid.updateTiles(tile,moveToIndex);
            grid.updateTiles(null,tileIndex);
        }
    };

    public abstract void implement(Tile tile, int tileIndex, int moveToIndex, Grid grid);
}
