package advanceacademy.homework07Sort.TeachersAndStudents;

import java.util.ArrayList;

public class Sister extends Heathen {
    public double salary;
    public ArrayList<String> groups;
    public Sister(String firstName,  String lastName, String email, String phoneNumber,
                  double salary, ArrayList<String> groups) {
        super(firstName, lastName, email, phoneNumber);
        this.salary = salary;
        this.groups = groups;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary () {
        this.salary = salary;
    }
    public ArrayList<String> getGroups() {
        return groups;
    }
    public void setGroups(java.util.ArrayList<String> groups) {
        this.groups = groups;
    }
    public void printInfoSister() {
        printInfo();
        System.out.printf("%n salary: " + getSalary());
        System.out.printf("%n classes: "+ getGroups());
    }

}
