import application.Game;
import infra.InfraFactory;


public class Main {
    public static void main(String[] args){
        var infraProvider = new InfraFactory();
        var game = new Game(infraProvider);

        game.setup();
        while (game.isRunning())
        {
            game.readInputs();
            game.update();
            game.draw();
        }
        game.cleanup();
    }
}
