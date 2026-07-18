package domain.valueobjects;

public class ScreenSize {
    private int width;
    private int height;

    public ScreenSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static ScreenSize with(int width, int height) {
        return new ScreenSize(width, height);
    }

    public int width() { return width; }

    public int height() { return height; }
}
