package infra.raylib;

import com.raylib.Colors;
import com.raylib.Raylib;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

public class RaylibUtils {
    public static Raylib.Vector2 positionToV2(Position position){
        Raylib.Vector2 vector2 = new Raylib.Vector2();
        vector2.y(position.y());
        vector2.x(position.x());
        return vector2;
    }

    public static Raylib.Vector2 sizeToV2(Size size){
        Raylib.Vector2 vector2 = new Raylib.Vector2();
        vector2.x(size.width());
        vector2.y(size.height());
        return vector2;
    }

    public static Raylib.Color domainColorToRaylib(domain.valueobjects.Colors color){
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
