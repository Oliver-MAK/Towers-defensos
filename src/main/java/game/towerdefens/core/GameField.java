package game.towerdefens.core;

import static game.towerdefens.core.TileType.EMPTY;

public class GameField {
    private Tile[][] grid;
    private int width;
    private int height;

    public GameField(int width, int height){
        this.width = width;
        this.height = height;
        grid = new Tile[height][width];

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                grid[i][j] = new Tile(EMPTY);
            }
        }

    }

    public Tile getTile(int x, int y){
        if (x < 0 || y < 0 || x >= width || y >= height){
            throw new IllegalArgumentException("wrong place");
        }
        return grid[y][x];
    }

    public void setTileType(int x, int y, TileType type){
        getTile(x, y).setType(type);
    }

}
