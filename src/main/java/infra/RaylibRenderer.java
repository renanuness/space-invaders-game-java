package infra;

import com.raylib.Colors;
import domain.Renderer;
import domain.shapes.Rectangle;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import static com.raylib.Raylib.*;

public class RaylibRenderer implements Renderer {

    public void RenderRectangle(Rectangle rectangle){
        DrawRectangleV(positionToV2(rectangle.position()),sizeToV2(rectangle.size()),  domainColorToRaylib(rectangle.color()));
    }

    private Vector2 positionToV2(Position position){
        Vector2 vector2 = new Vector2();
        vector2.y(position.y());
        vector2.x(position.x());
        return vector2;
    }

    private Vector2 sizeToV2(Size size){
        Vector2 vector2 = new Vector2();
        vector2.x(size.width());
        vector2.y(size.height());
        return vector2;
    }

    private Color domainColorToRaylib(domain.valueobjects.Colors color){
        switch (color){
            case domain.valueobjects.Colors.BLACK -> {
                return Colors.BLACK;
            }
            case domain.valueobjects.Colors.BLUE -> {
                return Colors.BLUE;
            }
            case domain.valueobjects.Colors.GRAY -> {
                return Colors.GRAY;
            }
            case domain.valueobjects.Colors.GREEN -> {
                return Colors.GREEN;
            }
            case domain.valueobjects.Colors.ORANGE -> {
                return Colors.ORANGE;
            }
            case domain.valueobjects.Colors.RED -> {
                return Colors.RED;
            }
            case domain.valueobjects.Colors.YELLOW -> {
                return Colors.YELLOW;
            }
            default -> {
                return Colors.BLACK;
            }
        }
    }
}
