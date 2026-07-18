package domain;

import domain.interfaces.*;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Displacement;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;
import java.util.List;

public class Spaceship extends GameObject implements Body, Movable {
    private Rectangle body;

    public Spaceship(Size size, Position position, Colors color) {
        body = new Rectangle(position, size, color);
    }

    @Override
    public void move(Displacement d) {
        body.position().move(d);
    }

    @Override
    public void update(){

    }

    @Override
    public ArrayList<Drawable> items() {
        return new ArrayList<Drawable>(List.of(body));
    }
}
