package domain;

import application.screens.AbstractScreen;

public abstract class GameObject {
    protected AbstractScreen screen;

    public void update(float deltaTime) {
        
    }

    public void registerScreen(AbstractScreen screen){
        this.screen = screen;
    }
}
