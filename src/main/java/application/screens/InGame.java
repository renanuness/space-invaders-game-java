package application.screens;

import domain.GameObject;
import domain.Spaceship;
import domain.interfaces.Body;
import domain.interfaces.Drawable;
import domain.interfaces.GameEngine;
import domain.interfaces.GameScreen;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;
import java.util.List;

public class InGame implements GameScreen {
    private List<GameObject> gameObjects;
    private GameEngine engine;

    public InGame(GameEngine engine) {
        this.engine = engine;
        gameObjects = new ArrayList<>();

        var spaceship = new Spaceship(Size.with(100,100), Position.with(350,200), Colors.BLUE);
        gameObjects.add(spaceship);
    }

    @Override
    public void update() {


    }

    @Override
    public void draw() {
        var bodies = gameObjects.stream().filter(Body.class::isInstance).map(Body.class::cast).toList();
        var drawables = new ArrayList<Drawable>();
        bodies.forEach(b -> drawables.addAll(b.items()));
        engine.updateScreen(drawables);
    }
}
