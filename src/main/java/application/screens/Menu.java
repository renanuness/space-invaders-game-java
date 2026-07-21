package application.screens;

import domain.UserInterface;
import domain.interfaces.GameEngine;

public class Menu extends AbstractScreen {
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
