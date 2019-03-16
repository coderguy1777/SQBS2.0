package GUIandJavaFXFrontEnd;

public class DynamicScale {
    public double screenHeight;
    public double screenWidth;
    public double objectHeight;
    public double objectWidth;

    public DynamicScale(double screenHeight, double screenWidth, double objectHeight, double objectWidth) {
        this.screenHeight = screenHeight;
        this.screenWidth = screenWidth;
        this.objectHeight = objectHeight;
        this.objectWidth = objectWidth;
    }

    public double scaleWindowW(double windowWidth) {
        double newWidth = 0.0;
        if(windowWidth >= windowWidth / 2) {
            newWidth = this.screenWidth / 2;
            windowWidth = newWidth;
        }
        newWidth = windowWidth;
        return newWidth;
    }

    public double scaleWindowH(double windowHeight) {
        double newHeight = 0.0;
        if(newHeight >= this.screenHeight/2) {
            newHeight = this.screenHeight/2;
            windowHeight = newHeight;
        }
        newHeight = windowHeight;
        return windowHeight;
    }

    public double scaleObjectXPos(double xPos) {
        return xPos;
    }

    public double scaleObjectYPos(double yPos) {
        return yPos;
    }

    public void setScreenHeight(double sh) {
        this.screenHeight = sh;
    }

    public void setScreenWidth(double sw) {
        this.screenWidth = sw;
    }

    public void setObjectHeight(double oh) {
        this.objectHeight = oh;
    }

    public void setObjectWidth(double ow) {
        this.objectWidth = ow;
    }

    public double getScreenHeight() {
        return this.screenHeight;
    }
}
