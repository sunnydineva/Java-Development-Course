package advanceacademyfundamentals;

public class User4 {
    // променливи
    public String firstName;
    public String lastName;
    public int age;

      // конструктор
    public User4(String firstName, String lastName, int age) { // Конструкторът
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

   // друг конструктор
    public User4(String firstName, String lastName) { // Конструкторът
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // метод
    public void userFullInfo () {
        System.out.println("Client's first name: "+ firstName);
        System.out.println("Client's last name: "+ lastName);
        System.out.println("Client's age: "+ age);
    }
    // друг метод
    public void userName () {
        System.out.println("Client's first name: "+ firstName);
        System.out.println("Client's last name: "+ lastName);
        System.out.println("Client's age: "+ age);
    }


    public String toString()
    {
        return this.firstName;
    }

    public void printInfo () {
        System.out.println(firstName + " " + lastName);
    }
}
