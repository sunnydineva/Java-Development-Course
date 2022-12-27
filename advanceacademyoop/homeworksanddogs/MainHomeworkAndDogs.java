package advanceacademyoop.homeworksanddogs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainHomeworkAndDogs {
    public static void main(String[] args) {

        List<Subject> subjects1 = Arrays.asList(Subject.MATH, Subject.CHEMISTRY);
        List<Subject> subjects2 = Arrays.asList(Subject.MATH, Subject.MUSIC);

        Map<String, Integer> grades1 = new HashMap<>();
        grades1.put("Math", 6);
        grades1.put("Chemistry", 5);
        grades1.put("Music", 2);

        Map<String, Integer> grades2 = new HashMap<>();
        grades2.put("Math", 2);
        grades2.put("Chemistry", 4);
        grades2.put("Music", 2);

        Student student1 = new Student("Maria", 15, grades1);
        Student student2 = new Student("Marina", 20, grades2);

        Teacher teacher1 = new Teacher("Ivanova", 30, subjects1);
        Teacher teacher2 = new Teacher("Draganova", 33, subjects2);

        Dog dog = new Dog("Bobby", "puddle", true, student1);

        MainAction studentMainAction = new StudentActionImpl();
        studentMainAction.introduce(student1);
        studentMainAction.introduce(student2);
        System.out.println("------------------");

        MainAction teacherMainAction = new StudentActionImpl();
        teacherMainAction.introduce(teacher1);
        teacherMainAction.introduce(teacher2);
        System.out.println("------------------");

        StudentAction studentAction = new StudentActionImpl();
        studentAction.isWritten();

        TeacherActions teacherActions = new TeacherActionImpl();
        teacherActions.askForHoHW(Subject.MATH, student1, studentAction.isWritten());
        System.out.println("------------------");
        teacherActions.askForHoHW(Subject.CHEMISTRY, student1, studentAction.isWritten());
        System.out.println("------------------");
        teacherActions.askForHoHW(Subject.MUSIC, student1, studentAction.isWritten());
        System.out.println("------------------");
        teacherActions.askForHoHW(Subject.MATH, student2, studentAction.isWritten());
        System.out.println("------------------");
        teacherActions.askForHoHW(Subject.CHEMISTRY, student2, studentAction.isWritten());
        System.out.println("------------------");
        teacherActions.askForHoHW(Subject.MUSIC, student2, studentAction.isWritten());
    }
}
