package application.screens;

import domain.GameObject;
import domain.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractScreen implements GameScreen {
    protected GameEngine engine;
    protected List<GameObject> gameObjects;

    public AbstractScreen(GameEngine engine) {
        gameObjects = new ArrayList<>();
        this.engine = engine;
    }


    @Override
    public void update() {
        gameObjects.forEach((gameObject -> gameObject.update(engine.deltaTime())));
    }

    @Override
    public void draw() {
        var bodies = gameObjects.stream().filter(Body.class::isInstance).map(Body.class::cast).toList();
        var drawables = new ArrayList<Drawable>();
        bodies.forEach(b -> drawables.addAll(b.items()));
        engine.updateScreen(drawables);
    }

    public void instantiateGameObject(GameObject gameObject){
        gameObjects.add(gameObject);
        gameObject.registerScreen(this);
        if(gameObject instanceof Commandable) {
            ((Commandable)gameObject).registerCommands(engine.controller());
        }
    }
}
