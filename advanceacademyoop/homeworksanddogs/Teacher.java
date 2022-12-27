package advanceacademyoop.homeworksanddogs;

import java.util.List;

public class Teacher extends Person {
    private List<Subject> subjects;

    public Teacher(String name, int age, List<Subject> subjects) {
        super(name, age);
        this.subjects = subjects;
    }
}
