package homeworksanddogs;

import java.util.Map;

public class Student extends Person {

    private Map<String, Integer> grades;

    public Student(String name, int age) {
        super(name, age);
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }


}
