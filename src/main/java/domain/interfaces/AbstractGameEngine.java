package domain.interfaces;

public abstract class AbstractGameEngine implements GameEngine {
    protected Renderer renderer;
    protected Controller controller;

    public AbstractGameEngine(Renderer renderer, Controller controller) {
        this.renderer = renderer;
    }

    public Renderer renderer() { return renderer;}
    public Controller controller() { return controller; }
}
