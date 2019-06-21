import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Window {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private int width;
    private int height;
    public Window(JFrame f, JPanel p, JButton b, int w, int h) {
        this.frame = f;
        this.panel = p;
        this.button = b;
        this.width = width;
    }

    public void show() {
        frame.setVisible(true);
    }

    public void close() {
        frame.setVisible(false);
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setPos(int x, int y) {
        this.frame.setBounds(x, y, this.width, this.height);
    }

    public void setPanelPos(int x, int y, int w, int h) {
        this.frame.setBounds(x, y, w, h);
    }
}