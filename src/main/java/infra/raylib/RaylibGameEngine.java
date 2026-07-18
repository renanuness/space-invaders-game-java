package infra.raylib;

import domain.GameSettings;
import domain.interfaces.AbstractGameEngine;
import domain.interfaces.Drawable;
import domain.interfaces.Renderer;

import java.util.List;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Raylib.*;
import static com.raylib.Raylib.EndDrawing;

public class RaylibGameEngine extends AbstractGameEngine {
    protected GameSettings settings;

    public RaylibGameEngine(GameSettings gameSetings, Renderer renderer) {
        super(renderer);
        settings = gameSetings;
    }

    @Override
    public void setup() {
        InitWindow(settings.screenSize().width(), settings.screenSize().height(), settings.title());
        SetTargetFPS(60);               // Set our game to run at 60 frames-per-second
    }

    @Override
    public void updateScreen(List<Drawable> drawables) {
        // Draw
        //----------------------------------------------------------------------------------
        BeginDrawing();

        ClearBackground(RAYWHITE);

        for(var drawable : drawables){
            drawable.draw(renderer);
        }

        EndDrawing();
        //----------------------------------------------------------------------------------
    }

    @Override
    public boolean windowShouldClose() {
        return WindowShouldClose();
    }

    @Override
    public void clenup() {
        CloseWindow();
    }

    @Override
    public float deltaTime() {
        return GetFrameTime();
    }
}
