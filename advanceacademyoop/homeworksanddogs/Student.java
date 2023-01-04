package advanceacademyoop.homeworksanddogs;

import java.util.Map;

public class Student extends Person{

    private Map<Subject, Integer> grades;

    public Student(String name, int age, Map<Subject, Integer> grades) {
        super(name, age);
        this.grades = grades;
    }

    public Map<Subject, Integer> getGrades() {
        return grades;
    }

    @Override
    public void introduce() {
            System.out.println("Hi, my name is " + super.getName() + " I',m a student.");
    }
}
