package advanceacademyoop.designpattern.mvc;

public class StudentController { //trough the Controller we want to update

    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void updateStudentName(String newName){
        model.setName(newName);
    }

    public void updateStudentNumber(int newNumber){
        model.setNumber(newNumber);
    }

    public String getStudentName(){
        return  model.getName();
    }

    public int getStudentNumber(){
        return  model.getNumber();
    }

    public void displayStudent(){
        view.display(model);
    }
}
