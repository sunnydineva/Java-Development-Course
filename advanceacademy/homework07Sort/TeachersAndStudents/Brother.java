package advanceacademy.homework07Sort.TeachersAndStudents;

import java.util.Arrays;


public class Brother extends Heathen {

    public String currentGroup;
    public int studentsNumber;
    public double grades[];


    public Brother(String firstName, String lastName, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
    }

    public Brother(String firstName, String lastName, String email, String phoneNumber,
                   String currentGroup, int studentsNumber, double grades[]) {
        super(firstName, lastName, email, phoneNumber);
        this.currentGroup = currentGroup;
        this.studentsNumber = studentsNumber;
        this.grades = grades;

    }


    public String getCurrentGroup() {
        return currentGroup;
    }

    public void setCurrentGroup(String currentGroup) {
        this.currentGroup = currentGroup;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentsNumber = studentsNumber;
    }

    public void printBrotherInfo() {
        super.printInfo();
        System.out.printf("%n currentGroup: " + currentGroup);
        System.out.printf("%n studentsNumber: " + studentsNumber);
        System.out.printf("%n grades: " + Arrays.toString(grades));
    }

}
