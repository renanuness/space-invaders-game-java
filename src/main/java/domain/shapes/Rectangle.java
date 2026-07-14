package domain.shapes;

import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

public class Rectangle {
    private Position position;
    private Size size;
    private Colors color;

    public Rectangle(Position position, Size size, Colors color) {
        this.position = position;
        this.size = size;
        this.color = color;
    }

    public Position position(){ return position; }
    public Size size(){ return size; }

    public Colors color() {
        return color;
    }
}
