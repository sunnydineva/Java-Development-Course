package advanceacademyfundamentals.homework07Sort.TeachersAndStudents;

public class Heathen {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Heathen(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Heathen(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    public String toString() {
        return this.email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void printInfo() {
        System.out.printf("%n Full info for the heathen: %s %s, %s", getFirstName(), getLastName(), getEmail());
    }


}
