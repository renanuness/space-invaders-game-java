package application.screens;

import domain.Spaceship;
import domain.interfaces.Drawable;
import domain.interfaces.GameEngine;
import domain.interfaces.GameScreen;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;

public class InGame implements GameScreen {
    private ArrayList<Drawable> drawables;
    private GameEngine engine;

    public InGame(GameEngine engine) {
        this.engine = engine;
        drawables = new ArrayList<>();

        var spaceship = new Spaceship(Size.with(100,100), Position.with(350,200), Colors.BLUE);
        drawables.add(spaceship);
    }

    @Override
    public void update() {

        engine.updateScreen(drawables);
    }

    @Override
    public void draw() {
    }
}
