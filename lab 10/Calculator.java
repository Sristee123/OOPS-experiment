package lab_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField display;
    String operator = "";
    double num1 = 0;

    public Calculator() {
        setLayout(new BorderLayout());
        display = new JTextField();
        add(display, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "0", "C", "=", "/"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setSize(300, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if ("0123456789".contains(input)) {
            display.setText(display.getText() + input);
        } else if ("+-*/".contains(input)) {
            num1 = Double.parseDouble(display.getText());
            operator = input;
            display.setText("");
        } else if (input.equals("=")) {
            double num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case "+": display.setText(String.valueOf(num1 + num2)); break;
                case "-": display.setText(String.valueOf(num1 - num2)); break;
                case "*": display.setText(String.valueOf(num1 * num2)); break;
                case "/": display.setText(num2 != 0 ? String.valueOf(num1 / num2) : "Error"); break;
            }
        } else if (input.equals("C")) {
            display.setText("");
            num1 = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

