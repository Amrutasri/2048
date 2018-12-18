package model;

public class Grid {

    private Tile[] tiles;

    private RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

    Grid() {
        tiles = new Tile[16];
        int index1 = randomNumberGenerator.generateNumberBetweenRange(15,0);
        int index2 = randomNumberGenerator.generateNumberBetweenRange(15,0);
        tiles[index1] = new Tile();
        tiles[index2] = new Tile();
    }

    public void updateTiles(Tile tile, int index) {
        tiles[index] = tile;
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
