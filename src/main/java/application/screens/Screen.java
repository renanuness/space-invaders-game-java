package application.screens;

import domain.interfaces.GameEngine;
import domain.interfaces.GameScreen;
import domain.interfaces.Renderer;

public abstract class Screen implements GameScreen {
    protected Renderer renderer;


    public Screen(GameEngine engine) {
        this.renderer = engine.renderer();
    }
}
