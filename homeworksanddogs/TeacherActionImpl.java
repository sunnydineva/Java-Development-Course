package homeworksanddogs;

import java.util.Map;

public class TeacherActionImpl implements MainAction, TeacherActions{
    @Override
    public void askForHoHW(Subject subject, Student student, boolean isWritten) {
        System.out.println("Today we will have " + subject);
        System.out.println(student.getName() + ", please, give me your homework.");

        for (Map.Entry<String, Integer> entry : student.getGrades().entrySet()) {
            Integer grade = entry.getValue();

            if (entry.getKey().equalsIgnoreCase(String.valueOf(subject))) {
                System.out.println("Your current grade is: " + grade);
                if (isWritten) {
                    if (grade < 6) {
                        grade += 1;
                    }
                    System.out.println("Well done, you got " + grade);
                } else {
                    if (grade > 2) {
                        grade -= 1;
                    }
                    System.out.println("Bow-wow, I ate it.");
                    System.out.println("I'm sorry, that your dog ate your homework. You got " + grade);
                }

            }
        }

    }

    @Override
    public void introduce(Person person) {
        System.out.println("Good day, students. I am your teacher " + person.getName() + ".");
    }
}
