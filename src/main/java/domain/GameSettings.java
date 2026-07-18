package domain;

import domain.valueobjects.ScreenSize;

public class GameSettings {
    private ScreenSize screenSize;

    public GameSettings(ScreenSize screenSize) {
        this.screenSize = screenSize;
    }

    public ScreenSize screenSize(){ return screenSize; }

    public String title() {
        return "Space Invaders";
    }
}
