package application;

import application.screens.InGame;
import domain.interfaces.GameEngine;
import domain.interfaces.GameScreen;
import domain.interfaces.InfraProvider;

public class Game {
    private GameScreen currentScreen;
    private GameEngine engine;

    public Game(InfraProvider infraProvider) {
        this.engine = infraProvider.getEngine();
        //currentScreen = new Menu(this.engine);
        currentScreen = new InGame(this.engine);
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

    public void readInputs() {

    }
}
