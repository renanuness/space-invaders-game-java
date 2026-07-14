package domain.valueobjects;

public class Size {
    private float width;
    private float height;

    public Size(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public static Size with(float width, float height) {
        return new Size(width, height);
    }

    public float width() { return width; }

    public float height() { return height; }
}
