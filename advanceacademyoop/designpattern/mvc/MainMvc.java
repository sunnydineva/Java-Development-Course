package advanceacademyoop.designpattern.mvc;

public class MainMvc {
    public static void main(String[] args) {


        StudentModel student = new StudentModel("Gergana", 456);
        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.displayStudent();
        controller.updateStudentNumber(123);
        controller.displayStudent();

    }
}
