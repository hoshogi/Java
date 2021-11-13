package hw6;

import javax.swing.*;
import java.awt.*;

public class ColorLabel extends JFrame {
    private Color[] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                             Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                             Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
                             Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA};
    private JLabel[] label = new JLabel[16];

    public ColorLabel() {
        setTitle("4X4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 15; i++) {
            label[i] = new JLabel(Integer.toString(i));
            label[i].setBackground(color[i]);
            label[i].setOpaque(true);
            add(label[i]);
        }

        setSize(400, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorLabel();
    }
}