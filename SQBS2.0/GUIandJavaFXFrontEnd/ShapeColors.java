package GUIandJavaFXFrontEnd;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import java.util.ArrayList;


class ShapeColors {
    int colorwanted;
    private ArrayList<Color>Colors = new ArrayList<>();

    ShapeColors(int colorwanted) {
        this.colorwanted = colorwanted;
        ColorVars();
    }

    Color getColor(int index) {
        this.colorwanted = index;
        return Colors.get(index);
    }

    private void ColorVars() {
        // Shades of blue.
        Color cyan = new Color(0.1, 0.7, 0.9, 0.9);
        Color navyblue = new Color(0.1, 0.3, 0.8, 0.5);
        Color teal = new Color(0.1, 0.5, 0.8, 0.9);
        Color aqua = new Color(0.1, 0.8, 0.9, 0.9);

        // Adds the colors to the new ArrayList in this case.
        Colors.add(cyan);
        Colors.add(navyblue);
        Colors.add(teal);
        Colors.add(aqua);
    }


    // Method for changing the color in this case
    // for a given shape in the ui mainly.
    public Color ChangeColor(int index, double r, double g, double b, double opac) throws ColorException{
        Color wantedcolor = Colors.get(index);

        if(r > 1.0 || r < 0.0) {
            throw new ColorException("Bounds is too small for r, try a different r value.");
        }

        if(g > 1.0 || g < 0.0) {
            throw new ColorException("Bounds is too small for g, try a different g value.");
        }

        if(b > 1.0 || b < 0.0) {
            throw new ColorException("Bounds is too small for b, try a different g value");
        }

        // Removes the old color and sets the new one up in this
        // case by adding it to the new arraylist for the colors in
        // this case.
        Colors.remove(wantedcolor);
        Color neww = new Color(r, g, b, opac);
        Colors.add(index, neww);
        return neww;
    }


}
