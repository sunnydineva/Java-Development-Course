package advanceacademyfundamentals.homework08GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.ListIterator;


// 3. Бонус направете още полета, които да съответстват на променливите на потребителя и още един бутон
// При натискане ще добавя нов потребител в масива.
// Добавете и още един бутон, който при натискане ще принтира в конзолата всички потребители.

public class ScreenThreeShit extends JFrame implements ActionListener {
    public ArrayList<User> users;
    public JTextField firstNameField;
    public JTextField lastNameField;
    public JTextField PINField;
    public JLabel label;
    public JButton searchUserButton;
    public JButton nextUserButton;
    public JButton previousUserButton;
    public JButton addUserButton;
    public JButton printAllUsersButton;


    public ScreenThreeShit() {
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
        User u2 = new User("Emanuela", "Dineva", 1450099333L);
        User u3 = new User("Daria", "Zheleva", 14500992222L);

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

        label = new JLabel("Results");
        lastNameField.setColumns(20);
        add(label);

        searchUserButton = new JButton("Search user by PIN");
        searchUserButton.addActionListener(this);
        add(searchUserButton);

        nextUserButton = new JButton("Next user");
        nextUserButton.addActionListener(this);
        add(nextUserButton);

        previousUserButton = new JButton("Previous user");
        previousUserButton.addActionListener(this);
        add(previousUserButton);

        addUserButton = new JButton("Add AdvanceAcademy.Homework09MoreGUI.User");
        addUserButton.addActionListener(this);
        add(addUserButton);

        printAllUsersButton = new JButton("Print all users");
        printAllUsersButton.addActionListener(this);
        add(printAllUsersButton);
    }

    public void nextUserAction() { //не функционира
        //показва само следващия - втори обект, дава грешка при опит да покаже третия - последен
        //вече го показва само частично
        ListIterator<User> userIterator = users.listIterator();
        if (!users.listIterator().hasNext()) {
            System.out.println("No more users here");
        } else if (userIterator.hasNext()) {
            userIterator.next();
            firstNameField.setText(userIterator.next().getFirstName()); //само това сменя
            lastNameField.setText(userIterator.next().getLastName()); // показва последното
            PINField.setText(String.valueOf(userIterator.next().getPIN())); // остава "PIN"
        }
    }

    public void previousUserAction() { //не функционира
        ListIterator<User> userIterator = users.listIterator();
        if (!users.listIterator().hasPrevious()) {
            System.out.println("No more users here");
        } else if (userIterator.hasPrevious()) {
            userIterator.previous();
            firstNameField.setText(userIterator.previous().getFirstName());
            lastNameField.setText(userIterator.previous().getLastName());
            PINField.setText(String.valueOf(userIterator.previous().getPIN()));
        }
    }

    public void searchUserAction() {
        boolean isFound = false;
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (PINField.getText().isEmpty() || PINField.getText().equals("PIN")) {
                System.out.println("PIN is required");
                return;
            }
            if ((Long.parseLong(PINField.getText())) == user.getPIN()) {
                PINField.setText(String.valueOf(user.getPIN()));
                firstNameField.setText(user.getFirstName());
                lastNameField.setText(user.getLastName());
                System.out.println(user.printUser());
                isFound = true;
            }
            if (!isFound) {
                label.setText("Result for this PIN not found");
            }
        }
    }

    public void resetFields() {
        firstNameField.setText("First name");
        lastNameField.setText("Last name");
        PINField.setText("PIN");
    }

    public void addUserAction() {
        if (PINField.getText().equals("PIN") || PINField.getText().isEmpty()) {
            System.out.println("Pop-up: PIN is required field");
            return;
        }
        User user = new User(firstNameField.getText(), lastNameField.getText(), Long.parseLong(PINField.getText()));
        users.add(user);
        resetFields();
        System.out.println("AdvanceAcademy.Homework09MoreGUI.User successfully added");
    }

    public void printAllUsersAction() {
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
        } else if (e.getSource() == previousUserButton) {
            previousUserAction();
        } else if (e.getSource() == nextUserButton) {
            nextUserAction();
        }
    }
}
