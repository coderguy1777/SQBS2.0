package GUIandJavaFXFrontEnd;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;

import java.util.ArrayList;


class ShapeColors {
    int colorwanted;
    public ArrayList<Color>Colors = new ArrayList<>();

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
        ArrayList<Color>blueshades = new ArrayList<>();
        Color cyan = new Color(0.1, 0.7, 0.9, 0.9);
        blueshades.add(cyan);
        Color navyblue = new Color(0.1, 0.3, 0.8, 0.5);
        blueshades.add(navyblue);
        Color teal = new Color(0.1, 0.5, 0.8, 0.9);
        blueshades.add(teal);
        Color aqua = new Color(0.1, 0.8, 0.9, 0.9);
        blueshades.add(aqua);

        // Shades of red
        ArrayList<Color>redshades = new ArrayList<>();
        Color maroon = new Color(0.8, 0.1, 0.1, 0.5);
        redshades.add(maroon);
        Color pastelred = new Color(0.8, 0.3, 0.3, 0.9);
        redshades.add(pastelred);
        Color lightred = new Color(0.9, 0.34, 0.3, 0.9);
        redshades.add(lightred);
        Color darkred = new Color(0.9, 0, 0, 0.4);
        redshades.add(darkred);

        // Shades of Green
        ArrayList<Color>greenshades = new ArrayList<>();
        Color pastelgreen = new Color(0.3, 0.8, 0.3, 0.95);
        greenshades.add(pastelgreen);
        Color darkgreen = new Color(0.1, 0.8, 0.1, 0.3);
        greenshades.add(darkgreen);
        Color navygreen = new Color(0.1, 0.9, 0.1, 0.1);
        greenshades.add(navygreen);
        Color turquoise = new Color(0.1, 0.6, 0.45, 0.8);
        greenshades.add(turquoise);

        //********************************************************************

        /* adds red shades */
        for(Color i: redshades) {
            addColors(i);
        }

        /* adds green shades */
        for(Color j: greenshades) {
            addColors(j);
        }

        /* adds blue shades */
        for(Color k: blueshades) {
            addColors(k);
        }

    }

    private void addColors(Color input) {
        Colors.add(input);
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
