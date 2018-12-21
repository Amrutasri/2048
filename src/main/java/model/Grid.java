package model;

public class Grid {

    private Tile[] tiles;

    private NumberGenerator numberGenerator = new NumberGenerator();

    Grid() {
        tiles = new Tile[16];
        int index1 = numberGenerator.generateRandomNumberBetweenRange(15,0);
        int index2 = numberGenerator.generateRandomNumberBetweenRange(15,0);
        tiles[index1] = new Tile();
        tiles[index2] = new Tile();
    }

    public void updateTiles(Tile tile, int index) {
        tiles[index] = tile;
    }

    public int getIndex(Tile tile) {
        for(int index=0; index<16; index++) {
            if(tiles[index]==tile) {
                return index;
            }
        }
        return -1;
    }

    public Tile createTile() {
        int newTileIndex = numberGenerator.generateRandomNumberBetweenRange(15,0);
        Tile tile = new Tile();
        tiles[newTileIndex] = tile;
        return tile;
    }

    public boolean isNull(int moveToIndex) {
        return tiles[moveToIndex]==null;
    }

    public boolean equals(int moveToIndex, Tile tile) {
        return tiles[moveToIndex]==tile;
    }

    public void slide(Tile tile, int tileIndex, int moveToIndex) {
        updateTiles(tile,moveToIndex);
        updateTiles(null,tileIndex);
    }

    public void merge(Tile tile, int tileIndex, int moveToIndex) {
        tiles[moveToIndex].updateValue(tile.getValue()+tile.getValue());
        tiles[tileIndex] = null;
    }
}
