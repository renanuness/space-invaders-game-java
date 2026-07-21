package application.screens;

import domain.Spaceship;
import domain.interfaces.GameEngine;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;

public class InGame extends AbstractScreen {
    public InGame(GameEngine engine) {
        super(engine);

        var spaceship = new Spaceship(Size.with(30,20), Position.with(350,200), Colors.BLUE);
        instantiateGameObject(spaceship);
    }

    @Override
    public void update() {
        super.update();
    }
}
