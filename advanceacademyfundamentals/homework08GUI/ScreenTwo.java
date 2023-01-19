package advanceacademyfundamentals.homework08GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


// 2. Направете GUI, което да има 1 текстово поле, 1 лейбъл и 1 бутон.
// При натискане на бутона, ще взема стойността от текстовото поле, което ще е ЕГН
// и ще проверява в масив от потребители. Когато намери резултат, лейбъла ще покаже информация за потребителя.
// Ако няма резултат ще покаже, че няма намерен резултат за това ЕГН.
// Потребителят трябва да има клас AdvanceAcademy.Homework09MoreGUI.User съответно с променливи конструктор и getters, setters.

public class ScreenTwo extends JFrame implements ActionListener {

    public JTextField textField;
    public JLabel label;
    public JButton button;
    public ArrayList<User> users;

    public ScreenTwo(){
        super("Screen Two - user by PIN");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(1,3));
        initializerElements();
    }

    public void initializerElements() {
        textField = new JTextField("PIN");
        add(textField);

        label = new JLabel("AdvanceAcademy.Homework09MoreGUI.User's info");
        add(label);

        button = new JButton("Show info");
        button.addActionListener(this);
        add(button);
    }


    public void buttonAction(){
        users = new ArrayList<User>();

        User u1 = new User("Sunny", "Dineva", 8312099111L);
        User u2 = new User("Emanuela", "Dineva", 1450099333L);
        User u3 = new User("Daria", "Zheleva", 14500992222L);

        users.add(u1);
        users.add(u2);
        users.add(u3);
        boolean isFound = false;
        for(User user : users){
            if (textField.getText().isEmpty() || textField.getText().equals("PIN")) {
                System.out.println("PIN is required");
                return;
            }
            if((Long.parseLong(textField.getText())) == user.getPIN()){
                label.setText(user.printUser());
                System.out.println(user.printUser());
                isFound = true;
            }
            if(!isFound) {
                label.setText("Result for this PIN not found");
            }

        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            buttonAction();
        }
    }
}
