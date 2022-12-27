package advanceacademy.homework07Sort;

import java.util.ArrayList;

public class Teacher extends User {
    //Учителя има заплата и масив с класове, които обучава
    private double salary =0;
    private ArrayList<String> classes = new ArrayList<>();
    public Teacher(String firstName, String lastName, String phone, String email, double salary, ArrayList<String> classes) {
        super(firstName, lastName, phone, email);
        this.salary = salary;
        this.classes = classes;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList<String> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Teacher: "
                + getFirstName() + " " + getLastName() + " " + "salary=" + salary + ", classes=" + classes;
    }
}
