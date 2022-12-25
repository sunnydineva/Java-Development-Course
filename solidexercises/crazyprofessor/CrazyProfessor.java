package solidexercises.crazyprofessor;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CrazyProfessor {
    public static void main(String[] args) {
        Map<String, Boolean> students = new HashMap<>();
        Random random = new Random();
        students.put("Ivan", random.nextBoolean());
        students.put("Spas", random.nextBoolean());
        students.put("Ivana", random.nextBoolean());
        students.put("Spasimira", random.nextBoolean());
        students.put("Gergana", random.nextBoolean());

        int lateStudents = 0;
        for (Map.Entry<String, Boolean> student : students.entrySet()) {
            Boolean isLate = student.getValue();
            System.out.println(student.getKey() + " - " + isLate);
            if (!isLate) {
                             lateStudents++;
            }
        }

        if (lateStudents > students.size() / 2) {
            System.out.println("Crazy professor will not teach today");
        } else {
            System.out.println("Crazy professor is happy today");
        }


    }
}
