package application;

import application.screens.Menu;
import domain.Spaceship;
import domain.interfaces.GameEngine;
import domain.interfaces.Drawable;
import domain.interfaces.GameScreen;
import domain.interfaces.InfraProvider;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;

public class Game {
    private GameScreen currentScreen;
    private GameEngine engine;


    public Game(InfraProvider infraProvider) {
        this.engine = infraProvider.getEngine();
        currentScreen = new Menu(this.engine);

    }

    public void setup(){
        engine.setup();

    }

    public void update(){
        currentScreen.update();
    }

    public void draw(){
      currentScreen.draw();
    }

    public boolean isRunning() { return !engine.windowShouldClose(); }

    public void cleanup() {
        engine.clenup();
    }
}
