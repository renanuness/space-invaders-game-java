package application.screens;

import domain.interfaces.GameEngine;
import domain.interfaces.Renderer;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

public class Menu extends Screen {
    public Menu(GameEngine engine) {
        super(engine);
    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        renderer.RenderRectangle(new Rectangle(Position.with(0,0), Size.with(120,120), Colors.ORANGE));
    }
}
