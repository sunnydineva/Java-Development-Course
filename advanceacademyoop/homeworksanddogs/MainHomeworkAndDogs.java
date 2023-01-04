package advanceacademyoop.homeworksanddogs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainHomeworkAndDogs {
    public static void main(String[] args) {

        List<Subject> subjects1 = Arrays.asList(Subject.MATH, Subject.CHEMISTRY);
        List<Subject> subjects2 = Arrays.asList(Subject.MATH, Subject.MUSIC);

        Map<Subject, Integer> grades1 = new HashMap<>();
        grades1.put(Subject.MATH, 6);
        grades1.put(Subject.CHEMISTRY, 5);
        grades1.put(Subject.MUSIC, 2);

        Map<Subject, Integer> grades2 = new HashMap<>();
        grades2.put(Subject.MATH, 2);
        grades2.put(Subject.CHEMISTRY, 4);
        grades2.put(Subject.MUSIC, 2);

        Student student1 = new Student("Maria", 15, grades1);
        Student student2 = new Student("Marina", 20, grades2);
        List<Student> students = Arrays.asList(student1, student2);

        Teacher teacher1 = new Teacher("Ivanova", 30, subjects1);
        Teacher teacher2 = new Teacher("Draganova", 33, subjects2);

        Dog dog1 = new Dog("Bobby", "puddle",  student1);
        Dog dog2 = new Dog("Terry", "husky",  student2);
        List<Dog> dogs = Arrays.asList(dog1, dog2);

        student1.introduce();
        student2.introduce();
        System.out.println("------------------");

        teacher1.introduce();
        teacher2.introduce();

        System.out.println();

        TeacherActions teacherActions = new TeacherActionImpl();
        System.out.println("---------TEACHER 1--------");
        teacherActions.askForHW(teacher1, students, dogs);
        System.out.println();
        System.out.println("---------TEACHER 2--------");
        teacherActions.askForHW(teacher2, students, dogs);
    }
}
