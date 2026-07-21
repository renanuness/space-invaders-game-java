package domain;

import domain.interfaces.Body;
import domain.interfaces.Drawable;
import domain.interfaces.Movable;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Displacement;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;
import java.util.List;

public class Bullet extends GameObject implements Body, Movable {
    private Rectangle body;
    private float speed = 250;

    public Bullet(Position position) {
        this.body = new Rectangle(Position.with(position.x(), position.y()), Size.with(3,14), Colors.RED);

    }

    @Override
    public void update(float deltaTime){
        body.position().move(new Displacement(0,-deltaTime*speed));
    }

    @Override
    public void move(Displacement d) {

    }

    @Override
    public ArrayList<Drawable> items() {
        return new ArrayList<Drawable>(List.of(body));
    }
}
