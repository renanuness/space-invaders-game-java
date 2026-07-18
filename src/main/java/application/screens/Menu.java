package application.screens;

import domain.UserInterface;
import domain.interfaces.Drawable;
import domain.interfaces.GameEngine;
import domain.interfaces.Renderer;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;

public class Menu extends Screen {
    private UserInterface ui;

    public Menu(GameEngine engine) {
        super(engine);
        ui = new UserInterface();
    }

    @Override
    public void update() {

    }

    @Override
    public void draw() {
        engine.updateScreen(ui.items());
    }
}
