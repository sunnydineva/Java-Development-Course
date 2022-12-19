package homeworksanddogs;

import java.util.List;

public class Teacher extends Person {

    private List<Subject> subjects;

    public Teacher(String name, int age, List<Subject> subjects) {
        super(name, age);
        this.subjects = subjects;
    }


    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }


}
