package lab_10;

import javax.swing.*;
import java.awt.event.*;

public class Stopwatch {
    static int time = 0;
    static Timer timer;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Stopwatch");
        JLabel label = new JLabel("0", JLabel.CENTER);
        label.setBounds(100, 50, 100, 30);

        JButton start = new JButton("Start");
        start.setBounds(30, 100, 80, 30);
        JButton stop = new JButton("Stop");
        stop.setBounds(120, 100, 80, 30);
        JButton reset = new JButton("Reset");
        reset.setBounds(210, 100, 80, 30);

        frame.add(label); frame.add(start); frame.add(stop); frame.add(reset);
        frame.setSize(350, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        timer = new Timer(1000, e -> {
            time++;
            label.setText(String.valueOf(time));
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());
        reset.addActionListener(e -> {
            timer.stop();
            time = 0;
            label.setText("0");
        });
    }
}

