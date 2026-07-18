package domain;

import domain.interfaces.Drawable;
import domain.interfaces.Movable;
import domain.interfaces.Renderer;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Displacement;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

public class Spaceship implements Drawable, Movable {
    private Rectangle body;

    public Spaceship(Size size, Position position, Colors color) {
        body = new Rectangle(position, size, color);
    }

    @Override
    public void draw(Renderer renderer) {
        renderer.RenderRectangle(body);
    }

    @Override
    public void move(Displacement d) {
        body.position().move(d);
    }
}
