package domain.commands;

import java.util.function.Consumer;

public class Command{
    private ActionType action;
    private Key key;
    private Consumer<Void> fn;

    public Command(ActionType action, Key key, Consumer<Void> fn) {
        this.action = action;
        this.key = key;
        this.fn = fn;
    }


    public ActionType action(){ return action; }
    public Key key() { return key; }
    public Consumer<Void> fn() { return fn; }
}

