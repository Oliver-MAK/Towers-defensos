package game.towerdefens.core;

public class Tile {
    private TileType type;

    Tile(TileType type) {
        this.type = type;
    }
    public TileType getType() {
        return type;
    }
    public TileType setType(TileType type) {
        this.type = type;
    }
    public TileType isBuildable() {
        if type == TileType.BUILDABLE{
            return TileType.BUILDABLE;
        }
    }
}
