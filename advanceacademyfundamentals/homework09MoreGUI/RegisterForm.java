package advanceacademyfundamentals.homework09MoreGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class RegisterForm extends JFrame implements ActionListener, MouseListener {
    // Направете пълна регистрационна форма на един потребител:
    // Име и фамилия - 2 полета (мин по 2 символа)
    // Телефон - поле - (мин 10 символа)
    // Имейл - поле - (мин 7 символа)
    // Пол - checkbox (трябва да има селектиран)
    // Държава, град, улица, пощенски код - колкото полета са нужни
    // Парола и потвърждаване на паролата (мин 8 символа)
    // Privacy Policy - CheckBox (задължилтено трябва да е избрано)
    // Направете валидация за абсолютно всичко и създайте обект AdvanceAcademy.Homework09MoreGUI.User като в него ще има друг обект AdvanceAcademy.Homework09MoreGUI.Location,
    // който ще държи адреса, държавата, града и пощенският код.
    // Пробвайте с toString() да принтирате всичко на този потребител.
    // Ако има нещо невалидно покажете съответния Popup.
    // Полетата трябва при клик да се изтрива текста вътре.
    public ArrayList<User> users;
    public JTextField firstNameField;
    public JTextField lastNameField;
    public JTextField phoneField;
    public JTextField emailField;
    public JRadioButton maleOption;
    public JRadioButton femaleOption;
    public JTextField countryField;
    public JTextField cityField;
    public JTextField streetField;
    public JTextField streetNoField;
    public JTextField postalCodeField;
    public JTextField passwordField;
    public JTextField reenterPasswordField;
    public JCheckBox privacyPolicyCheckBox;
    public JButton addUserButton;
    public JButton printUserButton;
    public String genderSelected;

    public RegisterForm() {
        super("Register form");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 4));

        initializerFields();
        initializerButtons();
        initializerRadioButtons();
        initializerCheckBoxes();

        users = new ArrayList<>();
    }

    public void initializerFields() {
        firstNameField = new JTextField("First name");
        firstNameField.addMouseListener(this);
        add(firstNameField);

        lastNameField = new JTextField("Last name");
        lastNameField.addMouseListener(this);
        add(lastNameField);

        phoneField = new JTextField("Phone");
        phoneField.addMouseListener(this);
        add(phoneField);

        emailField = new JTextField("email");
        emailField.addMouseListener(this);
        add(emailField);

        countryField = new JTextField("Country");
        countryField.addMouseListener(this);
        add(countryField);

        cityField = new JTextField("City");
        cityField.addMouseListener(this);
        add(cityField);

        streetField = new JTextField("Street");
        streetField.addMouseListener(this);
        add(streetField);

        streetNoField = new JTextField("No");
        streetNoField.addMouseListener(this);
        add(streetNoField);

        postalCodeField = new JTextField("Postal code");
        postalCodeField.addMouseListener(this);
        add(postalCodeField);

        passwordField = new JTextField("Password");
        passwordField.addMouseListener(this);
        add(passwordField);

        reenterPasswordField = new JTextField("Reenter password");
        reenterPasswordField.addMouseListener(this);
        add(reenterPasswordField);
    }

    public void resetFields() {
        firstNameField.setText("First name");
        lastNameField.setText("Last name");
        phoneField.setText("Phone");
        emailField.setText("email");
        maleOption.setSelected(false);
        femaleOption.setSelected(false);
        countryField.setText("Country");
        cityField.setText("City");
        streetField.setText("Street");
        streetNoField.setText("No");
        postalCodeField.setText("Postal code");
        passwordField.setText("Password");
        privacyPolicyCheckBox.setSelected(false);
    }

    public void initializerRadioButtons() {
        maleOption = new JRadioButton("Male");
        add(maleOption);

        femaleOption = new JRadioButton("Female");
        add(femaleOption);

        ButtonGroup group = new ButtonGroup();
        group.add(maleOption);
        group.add(femaleOption);
    }

    public void initializerCheckBoxes() {
        privacyPolicyCheckBox = new JCheckBox("I have read and agree to the Privacy Policy");
        add(privacyPolicyCheckBox);
    }

    public void initializerButtons() {
        addUserButton = new JButton("Add user");
        addUserButton.addActionListener(this);
        add(addUserButton);

        printUserButton = new JButton("Print user");
        printUserButton.addActionListener(this);
        add(printUserButton);

    }

    public boolean validations() {
        //validations
        // Име и фамилия - 2 полета (мин по 2 символа)
        if (firstNameField.getText().length() < 2 || firstNameField.getText().equals("First name")) {
            JOptionPane.showMessageDialog(null, "Please enter first name",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (lastNameField.getText().length() < 2 || lastNameField.getText().equals("Last name")) {
            JOptionPane.showMessageDialog(null, "Please enter your last name",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Телефон - поле - (мин 10 символа)
        if (phoneField.getText().length() < 10 || phoneField.getText().equals("Phone")) {
            JOptionPane.showMessageDialog(null, "Please enter your phone",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Имейл - поле - (мин 7 символа)
        if (emailField.getText().length() < 7 || emailField.getText().equals("email")) {
            JOptionPane.showMessageDialog(null, "Please enter your e-mail",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Пол - optionBox (трябва да има селектиран)
        if (maleOption.isSelected()) {
            genderSelected = "male";
        } else if (femaleOption.isSelected()) {
            genderSelected = "female";
        } else {
            JOptionPane.showMessageDialog(null, "Please select male or female",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Държава, град, улица, пощенски код - колкото полета са нужни
        if (countryField.getText().isEmpty() || countryField.getText().equals("Country")) {
            JOptionPane.showMessageDialog(null, "Please enter user's country",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (cityField.getText().isEmpty() || cityField.getText().equals("City")) {
            JOptionPane.showMessageDialog(null, "Please enter user's city",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (streetField.getText().isEmpty() || streetField.getText().equals("Street")) {
            JOptionPane.showMessageDialog(null, "Please enter user's street",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (streetNoField.getText().isEmpty() || streetNoField.getText().equals("No")) {
            JOptionPane.showMessageDialog(null, "Please enter user's street No",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (postalCodeField.getText().isEmpty() || postalCodeField.getText().equals("Postal code")) {
            JOptionPane.showMessageDialog(null, "Please enter user's postal code",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        // Парола и потвърждаване на паролата (мин 8 символа)
        if (passwordField.getText().length() < 8 || passwordField.getText().equals("Password")) {
            JOptionPane.showMessageDialog(null,
                    "Please enter password with at least 8 symbols",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!passwordField.getText().equals(reenterPasswordField.getText())) {
            JOptionPane.showMessageDialog(null,
                    "Passwords don't match",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Privacy Policy - CheckBox (задължилтено трябва да е избрано)
        if (!privacyPolicyCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(null, "Please read the Privacy Policy",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            return true;
        }
    }

    public void addUserAction() {
        if(validations()) {
            Location location = new Location(countryField.getText(), cityField.getText(), streetField.getText(),
                    streetNoField.getText(), postalCodeField.getText());

            User user = new User(firstNameField.getText(), lastNameField.getText(), phoneField.getText(),
                    emailField.getText(), genderSelected, location, passwordField.getText());
            users.add(user);

            resetFields();
            System.out.println("User successfully added");
        }
    }

    public void printUserAction() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addUserButton) {
            addUserAction();

        } else if (e.getSource() == printUserButton) {
            printUserAction();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (((JTextField) e.getSource()).getText().equals("First name") ||
                ((JTextField) e.getSource()).getText().equals("Last name") ||
                ((JTextField) e.getSource()).getText().equals("Phone") ||
                ((JTextField) e.getSource()).getText().equals("email") ||
                ((JTextField) e.getSource()).getText().equals("Country") ||
                ((JTextField) e.getSource()).getText().equals("City") ||
                ((JTextField) e.getSource()).getText().equals("Street") ||
                ((JTextField) e.getSource()).getText().equals("No") ||
                ((JTextField) e.getSource()).getText().equals("Postal code") ||
                ((JTextField) e.getSource()).getText().equals("Password") ||
                ((JTextField) e.getSource()).getText().equals("Reenter password"))

            ((JTextField) e.getSource()).setText(""); //cast, че е текстово поле
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
