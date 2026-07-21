package domain.interfaces;

import domain.commands.Command;

import java.util.List;

public abstract class AbstractGameEngine implements GameEngine {
    protected Renderer renderer;
    protected Controller controller;

    public AbstractGameEngine(Renderer renderer, Controller controller) {
        this.renderer = renderer;
        this.controller = controller;
    }

    public Renderer renderer() { return renderer;}
    public Controller controller() { return controller; }
}
