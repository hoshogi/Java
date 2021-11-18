package hw7;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomLabel extends JFrame {
    private Random random = new Random();

    public RandomLabel() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);
        for (int i = 0; i < 20; i++) {
            int x = random.nextInt(200) + 50;
            int y = random.nextInt(200) + 50;

            JLabel label = new JLabel();
            label.setSize(20, 20);
            label.setText(Integer.toString(i));
            label.setLocation(x, y);
            label.setBackground(Color.BLUE);
            label.setOpaque(true);
            add(label);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomLabel();
    }
}
