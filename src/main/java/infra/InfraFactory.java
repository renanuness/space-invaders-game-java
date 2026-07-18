package infra;

import domain.GameSettings;
import domain.interfaces.GameEngine;
import domain.interfaces.InfraProvider;
import domain.interfaces.Renderer;
import domain.valueobjects.ScreenSize;
import infra.raylib.RaylibGameEngine;
import infra.raylib.RaylibRenderer;

public class InfraFactory implements InfraProvider {
    private Renderer currentRenderer;
    private GameEngine currentAbc;

    public InfraFactory() {
        var settings = new GameSettings(ScreenSize.with(780,400));
        this.currentRenderer = new RaylibRenderer();
        this.currentAbc = new RaylibGameEngine(settings,currentRenderer);

    }


    public Renderer getCurrentRenderer(){
        return currentRenderer;
    }

    public GameEngine getEngine(){
        return currentAbc;
    }

}
