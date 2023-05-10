package Levels;

public class Level {
    private final int[][] levelData;

    public Level(int[][] levelData) {
        this.levelData = levelData;
    }

    public int getIndex(int x, int y) {
        return levelData[y][x];
    }

    public int[][] getLevelData() {
        return levelData;
    }
}
