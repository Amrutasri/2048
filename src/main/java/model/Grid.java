package model;

import java.util.ArrayList;
import java.util.List;

public class Grid {

    private List<Tile> tiles;

    public Grid() {
        tiles = new ArrayList<>(16);
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void addToTiles(Tile tile)  {
        tiles.add(tile);
    }
}
