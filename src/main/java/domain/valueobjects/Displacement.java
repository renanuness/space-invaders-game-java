package domain.valueobjects;

public class Displacement {
    private float x;
    private float y;

    public Displacement(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float x(){ return x; }
    public float y(){ return y(); }
}
