package domain.interfaces;

public abstract class AbstractGameEngine implements GameEngine {
    protected Renderer renderer;

    public AbstractGameEngine(Renderer renderer) {
        this.renderer = renderer;
    }

    public Renderer renderer() { return renderer;}
}
