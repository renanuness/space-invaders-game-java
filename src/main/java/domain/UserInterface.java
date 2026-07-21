package domain;

import domain.interfaces.Drawable;
import domain.interfaces.Renderer;
import domain.shapes.Rectangle;
import domain.valueobjects.Colors;
import domain.valueobjects.Position;
import domain.valueobjects.Size;

import java.util.ArrayList;

public class UserInterface {

    public ArrayList<Drawable> items() {
        var items = new ArrayList<Drawable>();
        items.add(new Rectangle(new Position(100, 100), new Size(30,30), Colors.BLUE));
        return items;
    }
}
