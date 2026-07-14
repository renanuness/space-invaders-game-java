package domain.valueobjects;

public class Position {
    private float x;
    private float y;


    public Position(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static Position with(float x, float y) {
        return new Position(x, y);
    }

    public float x() { return x; }
    public float y() { return y; }
}
