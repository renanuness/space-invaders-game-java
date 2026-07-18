package domain.interfaces;

import java.util.ArrayList;

public interface GameEngine {
    void setup();
    void updateScreen(ArrayList<Drawable> drawables);
    boolean windowShouldClose();
    void clenup();
    float deltaTime();
    Renderer renderer();
}


