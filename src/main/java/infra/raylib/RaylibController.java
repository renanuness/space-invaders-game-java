package infra.raylib;

import static com.raylib.Raylib.*;
import domain.interfaces.Controller;

import java.util.function.Consumer;

public class RaylibController implements Controller {

    public void readInputs(){
        IsKeyDown(KEY_LEFT);
        IsKeyPressed();
        IsKeyUp();
        IsKeyReleased();
    }
}

public class Command{
    private ActionType action;
    private Key key;
    private Consumer fn;
}

public enum ActionType{
    DOWN,
    PRESSED,
    UP,
    RELEASED
}

public enum Key{
    LEFT,
    RIGHT,
    SPACE,
    KEY_P,
}

/*
F, Key, Funcao
 */