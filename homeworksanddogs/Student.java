package homeworksanddogs;

import java.util.Map;

public class Student extends Person{

    private Map<String, Integer> grades;

    public Student(String name, int age, Map<String, Integer> grades) {
        super(name, age);
        this.grades = grades;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
