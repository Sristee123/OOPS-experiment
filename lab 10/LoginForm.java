package lab_10;

import javax.swing.*;
import java.awt.event.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 100, 30);
        JTextField userText = new JTextField();
        userText.setBounds(130, 30, 150, 30);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 100, 30);
        JPasswordField passText = new JPasswordField();
        passText.setBounds(130, 70, 150, 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(130, 110, 80, 30);

        JLabel result = new JLabel();
        result.setBounds(30, 150, 250, 30);

        frame.add(userLabel); frame.add(userText);
        frame.add(passLabel); frame.add(passText);
        frame.add(loginBtn); frame.add(result);

        loginBtn.addActionListener(e -> {
            String user = userText.getText();
            String pass = new String(passText.getPassword());

            if (user.equals("admin") && pass.equals("password"))
                result.setText("Login Successful");
            else
                result.setText("Invalid credentials");
        });

        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

