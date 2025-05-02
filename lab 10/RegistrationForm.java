package lab_10;

import javax.swing.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registration Form");
        frame.setLayout(null);

        JLabel nameL = new JLabel("Name:");
        nameL.setBounds(30, 30, 100, 30);
        JTextField nameT = new JTextField();
        nameT.setBounds(150, 30, 150, 30);

        JLabel emailL = new JLabel("Email:");
        emailL.setBounds(30, 70, 100, 30);
        JTextField emailT = new JTextField();
        emailT.setBounds(150, 70, 150, 30);

        JLabel passL = new JLabel("Password:");
        passL.setBounds(30, 110, 100, 30);
        JPasswordField passT = new JPasswordField();
        passT.setBounds(150, 110, 150, 30);

        JLabel confirmL = new JLabel("Confirm:");
        confirmL.setBounds(30, 150, 100, 30);
        JPasswordField confirmT = new JPasswordField();
        confirmT.setBounds(150, 150, 150, 30);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(100, 200, 100, 30);

        JLabel result = new JLabel();
        result.setBounds(30, 240, 300, 30);

        frame.add(nameL); frame.add(nameT);
        frame.add(emailL); frame.add(emailT);
        frame.add(passL); frame.add(passT);
        frame.add(confirmL); frame.add(confirmT);
        frame.add(registerBtn); frame.add(result);

        registerBtn.addActionListener(e -> {
            String name = nameT.getText();
            String email = emailT.getText();
            String pass = new String(passT.getPassword());
            String confirm = new String(confirmT.getPassword());

            if (name.isEmpty() || email.isEmpty() || pass.isEmpty() || confirm.isEmpty()) {
                result.setText("Please fill all fields.");
            } else if (!email.contains("@")) {
                result.setText("Invalid email.");
            } else if (!pass.equals(confirm)) {
                result.setText("Passwords do not match.");
            } else {
                result.setText("Registration successful!");
            }
        });

        frame.setSize(400, 350);
        frame.setVisible(true);
    }
}

