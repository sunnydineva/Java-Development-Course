package advanceacademy.homework07Sort;

public class User {
    //Имаме училищна система. В нея трябва да отделим учителите и учениците.
    // Общата информация между тях е, че имат имена, телефони, имейл. Отделната информация е следната:

    private String firstName = "";
    private String lastName = "";
    private String phone = "";
    private String email = "";

    public User(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public void printUser (){
        System.out.println("AdvanceAcademy.Homework09MoreGUI.User: " + " " + this.firstName + " " + this.lastName+ " " + this.email+ " " + this.phone );
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
