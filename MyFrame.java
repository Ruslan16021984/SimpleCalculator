package com.gmail.carbit3333333;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title, int width, int height, LayoutManager manager){
        super(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(manager);


    }
}
