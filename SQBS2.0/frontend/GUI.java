package frontend;
import java.util.*;
import java.io.*;
import javax.swing.*;
import tournament.*;

public class GUI {
    public static void main(String[]args) {
        JFrame frame = new JFrame();
        frame.setBounds(130, 100, 200, 200);
        JButton label = new JButton("SQBS 2.0");
        label.setBounds(0, 0, 200, 200);
        frame.add(label);
        JLabel lab = new JLabel();
        lab.setText("Test");
        JPanel panel = new JPanel();
        panel.add(lab);
        panel.setBounds(20, 20, 400, 400);
        frame.add(panel);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}