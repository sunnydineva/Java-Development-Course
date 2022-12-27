package advanceacademy.homework08GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenOne extends JFrame implements ActionListener {
    // 1. Направете GUI, което да има две текстови полета, един лейбъл и един бутон.
    // Когато въведем цифри в двете полета и натиснем на бутона, резултата да се показва в лейбъла.
    public JTextField textField1;
    public JTextField textField2;
    public JLabel label1;
    public JButton button;

    public ScreenOne() {
        super("Screen One - sum of 2 numbers");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(new GridLayout(2, 3));

        initializerFields();
        initializerButtons();
        initializerLabels();
    }

    public void initializerFields() {
        textField1 = new JTextField("TextField 1");
        add(textField1);
        textField2 = new JTextField("TextField 2");
        add(textField2);
    }

    public void initializerButtons() {
        button = new JButton("Button");
        button.addActionListener(this);
        add(button);
    }

    public void initializerLabels() {
        label1 = new JLabel("Result");
        add(label1);
    }

    public void buttonAction() {
        double number1 = Double.parseDouble(textField1.getText());
        double number2 = Double.parseDouble(textField2.getText());
        double result = number1 + number2;
        label1.setText(String.valueOf(result));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            buttonAction();
        }
    }
}
