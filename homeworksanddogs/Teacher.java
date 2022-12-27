package homeworksanddogs;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Teacher extends Person {
    private List<Subject> subjects;

    public Teacher(String name, int age, List<Subject> subjects) {
        super(name, age);
        this.subjects = subjects;
    }
}
