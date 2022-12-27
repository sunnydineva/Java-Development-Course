package advanceacademy.homework09MoreGUI;

public class User {
    // Телефон - поле - (мин 10 символа)
    // Имейл - поле - (мин 7 символа)
    // Пол - checkbox (трябва да има селектиран)
    // Държава, град, улица, пощенски код - колкото полета са нужни
    // Парола и потвърждаване на паролата (мин 8 символа)
    // Privacy Policy - CheckBox (задължилтено трябва да е избрано)
        private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String gender; //optionBox
    private Location location;
    private String password;
    private String privacyPolicy; //checkBox

    public User(String firstName, String lastName, String phone, String email, String gender, Location location,
                String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.gender = gender;
        this.location = location;
        this.password = password;

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivacyPolicy() {
        return privacyPolicy;
    }

    public void setPrivacyPolicy(String privacyPolicy) {
        this.privacyPolicy = privacyPolicy;
    }

    @Override
    public String toString() {
        return "AdvanceAcademy.Homework09MoreGUI.User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
