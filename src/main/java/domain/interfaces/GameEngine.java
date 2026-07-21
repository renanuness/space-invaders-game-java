package domain.interfaces;

import domain.commands.Command;

import java.util.List;

public interface GameEngine {
    void setup();
    void updateScreen(List<Drawable> drawables);
    boolean windowShouldClose();
    void clenup();
    float deltaTime();
    Renderer renderer();
    Controller controller();
}


