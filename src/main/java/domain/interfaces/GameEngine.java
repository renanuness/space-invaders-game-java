package domain.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface GameEngine {
    void setup();
    void updateScreen(List<Drawable> drawables);
    boolean windowShouldClose();
    void clenup();
    float deltaTime();
    Renderer renderer();
}


