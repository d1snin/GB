package xyz.d1snin.codearchive.homeworks.level1.homework8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    Window() {
        setVisible(true);
        setLocation(650, 650);
        setSize(500, 500);
        setTitle("Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(1, 2));
        JButton btn1 = new JButton("Exit");
        ActionListener actionListener = new CloseActionListener();
        btn1.addActionListener(actionListener);
        panel.add(btn1);
        JButton btn2 = new JButton("Button");
        panel.add(btn2);
        add(panel, BorderLayout.SOUTH);
    }
}
