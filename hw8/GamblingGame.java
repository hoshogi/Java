package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GamblingGame extends JFrame {
    private JLabel label[] = new JLabel[3];
    private JLabel textLabel = new JLabel();
    private JPanel panel = new JPanel();

    public GamblingGame() {
        setTitle("Gambling Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        for (int i = 0; i < 3; i++) {
            label[i] = new JLabel("0");
            label[i].setSize(60, 30);
            label[i].setLocation(30 + 80 * i, 50);
            label[i].setHorizontalAlignment(JLabel.CENTER);
            label[i].setOpaque(true);
            label[i].setBackground(Color.MAGENTA);
            label[i].setForeground(Color.YELLOW);
            label[i].setFont(new Font("Tahoma", Font.ITALIC, 30));
            panel.add(label[i]);
        }

        panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int[] x = new int[3];
                if (e.getKeyChar() == '\n') {
                    for (int i = 0; i < 3; i++) {
                        x[i] = (int) (Math.random() * 5);
                        label[i].setText(Integer.toString(x[i]));
                    }
                }

                if (x[0] == x[1] && x[1] == x[2]) {
                    textLabel.setText("축하합니다!!");
                } else {
                    textLabel.setText("아쉽군요");
                }
            }
        });

        textLabel.setText("시작합니다.");
        textLabel.setSize(100, 30);
        textLabel.setLocation(110, 150);
        panel.add(textLabel);

        setContentPane(panel);

        setSize(300, 250);
        setVisible(true);

        panel.setFocusable(true);
        panel.requestFocus();
    }

    public static void main(String[] args) {
        new GamblingGame();
    }
}
