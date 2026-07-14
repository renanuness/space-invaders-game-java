import com.raylib.Colors;
import domain.shapes.Rectangle;
import domain.valueobjects.Position;
import domain.valueobjects.Size;
import infra.RaylibRenderer;

import static com.raylib.Colors.RAYWHITE;
import static com.raylib.Raylib.*;

public class Main {
    public static void main(String[] args){
        final int screenWidth = 800;
        final int screenHeight = 450;

        InitWindow(screenWidth, screenHeight, "raylib [core] example - basic window");
        SetTargetFPS(60);               // Set our game to run at 60 frames-per-second

        var renderer = new RaylibRenderer();
        while (!WindowShouldClose())    // Detect window close button or ESC key
        {
            // Draw
            //----------------------------------------------------------------------------------
            BeginDrawing();

            ClearBackground(RAYWHITE);

            DrawText("Congrats! You created your first window!", 190, 200, 20, Colors.LIGHTGRAY);

            EndDrawing();
            //----------------------------------------------------------------------------------
        }

        // De-Initialization
        //--------------------------------------------------------------------------------------
        CloseWindow();        // Close window and OpenGL context
        //--------------------------------------------------------------------------------------
    }
}
