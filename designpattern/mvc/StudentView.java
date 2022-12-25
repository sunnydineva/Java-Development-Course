package designpattern.mvc;

public class StudentView {

    public void display(StudentModel student){
        System.out.println(student.getName() + " " + student.getNumber());
    }
}
