package com.gmail.carbit3333333;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    private JButton[] jButtons = new JButton[10];

    public MyPanel(String name, int width, int heigh, LayoutManager manager) {
        setName(name);
        setSize(width, heigh);
        setLayout(manager);
    }
}
