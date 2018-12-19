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
        return 0;
    }

    public boolean consists(Tile tile) {
        boolean flag = false;
        for(int index=0; index<16; index++) {
            if(tiles[index] == tile) {
                flag = true;
            }
        }
        return flag;
    }
}
