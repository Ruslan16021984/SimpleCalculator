package com.gmail.carbit3333333;

import javax.swing.*;
import java.awt.*;

public class UI {
    private MyFrame myFrame;

   private MyButton[] myButton = new MyButton[9];


   private MyPanel myPanel;
   private MyPanel myPanel2;
   private MyPanel myPanel3;

   private MyButton btnAdd;
   private MyButton btnDyvide;
   private MyButton btnSustruct;
   private MyButton btnMultypli;

   private JLabel jLabel;
   private JLabel jLabel2;
   private JLabel jLabel3;

   private MyTextField txtChislo1;
   private MyTextField txtChislo2;
   private MyTextField txtResult;
   public void createUI(){
       textField();
       createButton();
       createPanels();
       createFrame();
   }

   private void createButton(){
       btnAdd = new MyButton("прибавить");
       btnMultypli = new MyButton("Умножение");
       btnDyvide = new MyButton("деление");
       btnSustruct = new MyButton("вычитание");
       }

    private void createPanels(){
        myPanel = new MyPanel("panel1",100, 100, new FlowLayout(FlowLayout.LEFT));
        myPanel.setPreferredSize(new Dimension(250, 50));

        myPanel2 = new MyPanel("panel1",100, 100, new FlowLayout(FlowLayout.LEFT));
        myPanel2.setPreferredSize(new Dimension(250, 50));

        myPanel3 = new MyPanel("panel1",100, 100, new FlowLayout(FlowLayout.LEFT));
        myPanel3.setPreferredSize(new Dimension(250, 50));


        myPanel.add(txtChislo1);
        myPanel.add(jLabel);
        myPanel.add(txtChislo2);
        myPanel.add(jLabel2);

        myPanel3.add(txtResult);
        myPanel3.add(jLabel3);

        myPanel2.add(btnAdd);
        myPanel2.add(btnDyvide);
        myPanel2.add(btnSustruct);
        myPanel2.add(btnMultypli);
    }
    private void createFrame(){
       myFrame = new MyFrame("калькулятор", 430, 200, new BorderLayout(2,2));
       myFrame.setMaximumSize(new Dimension(430, 200));
       myFrame.setResizable(false);

       myFrame.getContentPane().add(myPanel, BorderLayout.NORTH);
       myFrame.getContentPane().add(myPanel2, BorderLayout.CENTER);
       myFrame.getContentPane().add(myPanel3, BorderLayout.SOUTH);
       myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

       myFrame.setVisible(true);
    }
    private   void textField(){
       txtChislo1 = new MyTextField("", 10);
       txtChislo2 = new MyTextField("", 10);
       txtResult = new MyTextField("", 10);

       jLabel = new JLabel("число 1");
       jLabel2 = new JLabel("чмсло 2");
       jLabel3 = new JLabel("результат");


    }

}
