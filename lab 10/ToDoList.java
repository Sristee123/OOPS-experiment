package lab_10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("To-Do List");
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        JTextField taskField = new JTextField();
        JButton addBtn = new JButton("Add");
        JButton removeBtn = new JButton("Remove");

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel inputPanel = new JPanel(new BorderLayout());
        inputPanel.add(taskField, BorderLayout.CENTER);
        inputPanel.add(addBtn, BorderLayout.EAST);

        JPanel controlPanel = new JPanel(new FlowLayout());
        controlPanel.add(removeBtn);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(controlPanel, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            String task = taskField.getText();
            if (!task.isEmpty()) {
                model.addElement(task);
                taskField.setText("");
            }
        });

        removeBtn.addActionListener(e -> {
            int index = list.getSelectedIndex();
            if (index != -1) {
                model.remove(index);
            }
        });

        frame.setSize(300, 400);
        frame.setVisible(true);
    }
}

