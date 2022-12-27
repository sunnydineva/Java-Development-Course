package solidexercises.crazyprofessor;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CrazyProfessor {
    /*
    2зад. Професор в университет има правило, което казва, че ако повече от половината студенти не се
появят навреме в залата, то той няма да влезе да преподава. С цел да разбере дали трябва да влезе или не,
той седи на вратата и си записва срещу името на всеки студент дали е дошъл навреме.
Да се напише програма, която съдържа списък от имената на всички студенти и инфорация кой от тях е
закъснял и кой не (това се случва на случаен принцип). След изпълнение на програмата се отпечатват
всички студенти с информация кой е бил навреме и кой не, както и информация дали професорът ще
влезе в залата.
Пример:
Студенти: Ivan, Spas, Ivana, Spasimira и Gergana
Записки на професора:
Ivan – is late
Spas – on time
Ivana – on time
Spasimira – is late
Gergana – is late
Резултат: професорът няма да преподава
     */
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
