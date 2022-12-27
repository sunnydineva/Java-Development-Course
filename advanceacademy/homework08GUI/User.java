package advanceacademy.homework08GUI;

public class User {
    private String firstName;
    private String lastName;
    private long PIN;

    public User(String firstName, String lastName, long PIN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PIN = PIN;
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

    public long getPIN() {
        return PIN;
    }

    public void setPIN(long PIN) {
        this.PIN = PIN;
    }

    public String printUser(){
        return this.firstName + " " + this.lastName + ": " + this.PIN;
    }


    @Override
    public String toString() {
        return "AdvanceAcademy.Homework09MoreGUI.User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PIN=" + PIN +
                '}';
    }
}
