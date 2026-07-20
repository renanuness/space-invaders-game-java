package infra;

import domain.GameSettings;
import domain.interfaces.GameEngine;
import domain.interfaces.InfraProvider;
import domain.valueobjects.ScreenSize;
import infra.raylib.RaylibController;
import infra.raylib.RaylibGameEngine;
import infra.raylib.RaylibRenderer;

public class InfraFactory implements InfraProvider {
    private GameEngine gameEngine;

    public InfraFactory() {
        var settings = new GameSettings(ScreenSize.with(780,400));
        var currentRenderer = new RaylibRenderer();
        var controller = new RaylibController();
        this.gameEngine = new RaylibGameEngine(settings,currentRenderer, controller);

    }



    public GameEngine getEngine(){
        return gameEngine;
    }

}
