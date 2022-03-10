package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonsAndTextField extends JFrame implements WindowListener, ActionListener {

    private TextField textField = new TextField();

    //Buttons
    private String text = "";
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    private JButton b3 = new JButton("3");
    private JButton b4 = new JButton("4");
    private JButton b5 = new JButton("5");
    private JButton b6 = new JButton("6");
    private JButton b7 = new JButton("7");
    private JButton b8 = new JButton("8");
    private JButton b9 = new JButton("9");
    private JButton b0 = new JButton("0");
    private JButton plus = new JButton("+");
    private JButton minus = new JButton("-");
    private JButton del = new JButton("D");
    private JButton equals = new JButton("=");
    private JButton divide = new JButton("/");
    private JButton multiply = new JButton("*");

    private double num1 = 0;
    private double num2 = 0;
    private char symbol;

    public ButtonsAndTextField() {
        Font font = new Font("SanSerif", Font.BOLD, 20);
        setTitle("Calculator");
        setSize(260, 370);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        textField.setBounds(10, 10, 230, 50);
        textField.setEditable(false);
        textField.setFont(font);
        setVisible(true);
        add(textField);

        b1.setBounds(10, 90, 50, 50);
        b1.setFont(font);
        add(b1);
        b1.addActionListener(this);

        b2.setBounds(70, 90, 50, 50);
        b2.setFont(font);
        add(b2);
        b2.addActionListener(this);

        b3.setBounds(130, 90, 50, 50);
        b3.setFont(font);
        add(b3);
        b3.addActionListener(this);

        plus.setBounds(190, 90, 50, 50);
        plus.setFont(font);
        add(plus);
        plus.addActionListener(this);

        b4.setBounds(10, 150, 50, 50);
        b4.setFont(font);
        add(b4);
        b4.addActionListener(this);

        b5.setBounds(70, 150, 50, 50);
        b5.setFont(font);
        add(b5);
        b5.addActionListener(this);

        b6.setBounds(130, 150, 50, 50);
        b6.setFont(font);
        add(b6);
        b6.addActionListener(this);

        minus.setBounds(190, 150, 50, 50);
        minus.setFont(font);
        add(minus);
        minus.addActionListener(this);

        b7.setBounds(10, 210, 50, 50);
        b7.setFont(font);
        add(b7);
        b7.addActionListener(this);

        b8.setBounds(70, 210, 50, 50);
        b8.setFont(font);
        add(b8);
        b8.addActionListener(this);

        b9.setBounds(130, 210, 50, 50);
        b9.setFont(font);
        add(b9);
        b9.addActionListener(this);

        multiply.setBounds(190, 210, 50, 50);
        multiply.setFont(font);
        add(multiply);
        multiply.addActionListener(this);

        b0.setBounds(10, 270, 50, 50);
        b0.setFont(font);
        add(b0);
        b0.addActionListener(this);

        equals.setBounds(70, 270, 50, 50);
        equals.setFont(font);
        add(equals);
        equals.addActionListener(this);

        del.setBounds(130, 270, 50, 50);
        del.setFont(font);
        add(del);
        del.addActionListener(this);

        divide.setBounds(190, 270, 50, 50);
        divide.setFont(font);
        add(divide);
        divide.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            text += b1.getText();
            textField.setText(text);
        }
        if (e.getSource() == b2) {
            text += b2.getText();
            textField.setText(text);
        }
        if (e.getSource() == b3) {
            text += b3.getText();
            textField.setText(text);
        }
        if (e.getSource() == b4) {
            text += b4.getText();
            textField.setText(text);
        }
        if (e.getSource() == b5) {
            text += b5.getText();
            textField.setText(text);
        }
        if (e.getSource() == b6) {
            text += b6.getText();
            textField.setText(text);
        }
        if (e.getSource() == b7) {
            text += b7.getText();
            textField.setText(text);
        }
        if (e.getSource() == b8) {
            text += b8.getText();
            textField.setText(text);
        }
        if (e.getSource() == b9) {
            text += b9.getText();
            textField.setText(text);
        }
        if (e.getSource() == b0) {
            text += b0.getText();
            textField.setText(text);
        }
        if (e.getSource() == del) {
            text = text.substring(0, text.length() - 1);
            textField.setText(text);
        }
        if (e.getSource() == plus) {
            num1 = Double.parseDouble(text);
            textField.setText(text + plus.getText());
            symbol = '+';
            text = "";
        }
        if (e.getSource() == minus) {
            num1 = Integer.parseInt(text);
            textField.setText(text + minus.getText());
            symbol = '-';
            text = "";
        }
        if (e.getSource() == multiply) {
            num1 = Integer.parseInt(text);
            textField.setText(text + multiply.getText());
            symbol = '*';
            text = "";
        }
        if (e.getSource() == divide) {
            num1 = Integer.parseInt(text);
            textField.setText(text + divide.getText());
            symbol = '/';
            text = "";
        }
        if (e.getSource() == equals) {
            if (symbol == '+') {
                num2 = Integer.parseInt(text);
                textField.setText(String.valueOf(num1 + num2));
            }
            if (symbol == '-') {
                num2 = Integer.parseInt(text);
                textField.setText(String.valueOf(num1 - num2));
            }
            if (symbol == '*') {
                num2 = Integer.parseInt(text);
                textField.setText(String.valueOf(num1 * num2));
            }
            if (symbol == '/') {
                num2 = Integer.parseInt(text);
                textField.setText(String.valueOf(num1 / num2));
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
