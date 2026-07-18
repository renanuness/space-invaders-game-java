package infra.raylib;

import domain.interfaces.Renderer;
import domain.shapes.Rectangle;

import static com.raylib.Raylib.*;
import static infra.raylib.RaylibUtils.*;

public class RaylibRenderer implements Renderer {

    public void RenderRectangle(Rectangle rectangle){
        DrawRectangleV(positionToV2(rectangle.position()),sizeToV2(rectangle.size()),  domainColorToRaylib(rectangle.color()));
    }
}
