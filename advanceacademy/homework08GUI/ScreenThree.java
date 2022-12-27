package advanceacademy.homework08GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


// 3. Бонус направете още полета, които да съответстват на променливите на потребителя и още един бутон
// При натискане ще добавя нов потребител в масива.
// Добавете и още един бутон, който при натискане ще принтира в конзолата всички потребители.

public class ScreenThree extends JFrame implements ActionListener {
    public ArrayList<User> users;
    public JTextField firstNameField;
    public JTextField lastNameField;
    public JTextField PINField;
    public JLabel label;
    public JButton searchUserButton;
    public JButton addUserButton;
    public JButton printAllUsersButton;


    public ScreenThree() {
        super("Screen Three - bonus");
        setSize(700, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        addArray();
        initializerElements();
    }

    public void addArray() {
        users = new ArrayList<User>();

        User u1 = new User("Sunny", "Dineva", 8312099111L);
        User u2 = new User("Emanuela", "Dineva", 9999999999L);
        User u3 = new User("Daria", "Zheleva", 8888888888L);

        users.add(u1);
        users.add(u2);
        users.add(u3);
    }

    public void initializerElements() {
        firstNameField = new JTextField();
        firstNameField.setText("First name");
        firstNameField.setColumns(20); //само с това го удължи, setSize() сигурно не ок с Flow
        add(firstNameField);

        lastNameField = new JTextField("Last name");
        lastNameField.setColumns(20);
        add(lastNameField);

        PINField = new JTextField("PIN");
        PINField.setColumns(20);
        add(PINField);

        searchUserButton = new JButton("Search user by PIN");
        searchUserButton.addActionListener(this);
        add(searchUserButton);

        addUserButton = new JButton("Add AdvanceAcademy.Homework09MoreGUI.User");
        addUserButton.addActionListener(this);
        add(addUserButton);

        printAllUsersButton = new JButton("Print all users");
        printAllUsersButton.addActionListener(this);
        add(printAllUsersButton);

        label = new JLabel();
        label.setVisible(false);
        add(label);
    }

    public void searchUserAction() {
        label.setVisible(false);
        boolean isFound = false;
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (PINField.getText().isEmpty() || PINField.getText().contains("P")) {
                PINField.setText("Please enter searched PIN");
                System.out.println("Please enter PIN here");
                return;
            }
            if ((Long.parseLong(PINField.getText())) == user.getPIN()) {
                PINField.setText(String.valueOf(user.getPIN()));
                firstNameField.setText(user.getFirstName());
                lastNameField.setText(user.getLastName());
                System.out.println(user.printUser());
                isFound = true;
            }
        }
        if (!isFound) {
            label.setVisible(true);
            label.setText("Result for this PIN not found");

            System.out.println("Result for this PIN not found");
        }
    }

    public void resetFields() {
        label.setVisible(false);
        firstNameField.setText("First name");
        lastNameField.setText("Last name");
        PINField.setText("PIN");
    }

    public void addUserAction() {

        if (PINField.getText().contains("P") || PINField.getText().isEmpty()) {
            PINField.setText("Please enter PIN here");
            System.out.println("Pop-up: PIN is required field");
            return;
        }
        User user = new User(firstNameField.getText(), lastNameField.getText(), Long.parseLong(PINField.getText()));
        users.add(user);
        resetFields();
        label.setVisible(true);
        label.setText(user.printUser() + " successfully added");
        System.out.println("AdvanceAcademy.Homework09MoreGUI.User successfully added");
    }

    public void printAllUsersAction() {
        label.setVisible(false);
        for (User user : users) {
            System.out.println(user.printUser());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchUserButton) {
            searchUserAction();
        } else if (e.getSource() == addUserButton) {
            addUserAction();
        } else if (e.getSource() == printAllUsersButton) {
            printAllUsersAction();
        }
    }
}
