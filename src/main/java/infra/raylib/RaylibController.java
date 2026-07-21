package infra.raylib;

import static com.raylib.Raylib.*;

import com.raylib.Raylib;
import domain.commands.ActionType;
import domain.commands.Command;
import domain.commands.Key;
import domain.interfaces.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class RaylibController implements Controller {
    private List<Command> commands;

    public RaylibController() {
        commands = new ArrayList<>();
    }


    public void registerCommands(List<Command> commands) {
        this.commands.addAll(commands);
    }

    public void readInputs(){

        for(var cmd: commands){

            if(functionMappaing(cmd.action()).apply(keyMapping(cmd.key()))){
                cmd.fn().accept(null);
            }
        }
    }

    private int keyMapping(Key key){
        switch (key){
            case RIGHT -> {
                return KEY_RIGHT;
            }case LEFT -> {
                return KEY_LEFT;
            }case SPACE -> {
                return KEY_SPACE;
            }case KEY_P -> {
                return KEY_P;
            }default -> {
                return KEY_NULL;
            }
        }
    }

    private Function<Integer, Boolean> functionMappaing(ActionType action){
        switch (action){
            case DOWN -> {
                return  Raylib::IsKeyDown;
            } case UP ->{
                return Raylib::IsKeyUp;
            }case PRESSED -> {
                return Raylib::IsKeyPressed;
            }case RELEASED -> {
                return Raylib::IsKeyReleased;
            }default -> {
                return null;
            }
        }
    }
}





/*
F, Key, Funcao
 */