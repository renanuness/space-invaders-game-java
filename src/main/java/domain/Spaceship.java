package domain;

import domain.commands.ActionType;
import domain.commands.Command;
import domain.commands.Key;
import domain.interfaces.*;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Displacement;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;
import java.util.List;

public class Spaceship extends GameObject implements Commandable, Body, Movable {
    private Rectangle body;
    private final float maxSpeed;
    private float currentSpeed;

    public Spaceship(Size size, Position position, Colors color) {
        maxSpeed = 150;
        currentSpeed = 0f;
        body = new Rectangle(position, size, color);
    }

    @Override
    public void move(Displacement d) {
        body.position().move(d);
    }

    private void accelerate(int direction){
        if(Math.abs(currentSpeed) < maxSpeed) {
            if(direction == 1) {
                currentSpeed += maxSpeed * 0.3f;
            }else if(direction == -1){
                currentSpeed -= maxSpeed * 0.3f;
            }
        }
    }

    private void stop(){
        currentSpeed = 0;
    }

    @Override
    public void update(float deltaTime){
        if(currentSpeed != 0){
            body.position().move(new Displacement(currentSpeed*deltaTime, 0));
        }
    }

    @Override
    public ArrayList<Drawable> items() {
        return new ArrayList<Drawable>(List.of(body));
    }

    private void shoot(){
        var bulletPosition = body.position();
//        .move(new Displacement(0, -5));
        screen.instantiateGameObject(new Bullet(bulletPosition));
    }
    @Override
    public void registerCommands(Controller controller) {
        var moveLeftCmd = new Command(ActionType.DOWN, Key.LEFT, (x)->this.accelerate(-1));
        var moveRightCmd = new Command(ActionType.DOWN, Key.RIGHT, (x)->this.accelerate(1));
        var stopLeftCmd = new Command(ActionType.RELEASED, Key.LEFT, (x)->this.stop());
        var stopRightCmd = new Command(ActionType.RELEASED, Key.RIGHT, (x)->this.stop());
        var shootCmd = new Command(ActionType.PRESSED, Key.SPACE, (x)->this.shoot());
        var commands = new ArrayList<Command>();
        commands.add(moveLeftCmd);
        commands.add(moveRightCmd);
        commands.add(stopRightCmd);
        commands.add(stopLeftCmd);
        commands.add(shootCmd);

        controller.registerCommands(commands);
    }
}
