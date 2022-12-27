package advanceacademy.homework07Sort;

import java.util.ArrayList;

//Добре браво сетила си се за каста на 3-та задача.
// Слагай break не return във фор луповете, защото евентуално ако има код след лупа
// няма да бъде изпълнен с return, а с break ще се изпълни.
// Друго на последната задача, защо ти е този допълнителен масив :)
// Искам само учителя с най-високата заплата, да знам кой да уволня

public class Homework07 {
    public static ArrayList<User> users;
    public static ArrayList<String> classesU4;
    public static ArrayList<String> classesU5;

    public static void main(String[] args) {

// Имаме училищна система. В нея трябва да отделим учителите и учениците.
// Общата информация между тях е, че имат имена, телефони, имейл. Отделната информация е следната:
// Учителя има заплата и масив с класове, които обучава
// Студента има текущ клас и масив с оценки, факултетен номер
// Вкарайте няколко учителя и ученици в един масив и направете следните методи:
        int gradesU1[] = {6, 6, 6, 6}; // оценките на ученик u1
        int gradesU2[] = {5, 5, 5, 6}; // оценките на ученик u2
        int gradesU3[] = {3, 3, 3, 3}; // оценките на ученик u3

        classesU4 = new ArrayList<>(); //класовете на учител u4
        classesU4.add("Math");
        classesU4.add("Poetry");

        classesU5 = new ArrayList<>(); //класовете на учител u5 r u6
        classesU5.add("Astronomy");
        classesU5.add("Math");

        Student u1 = new Student("Sunny", "Dineva", "0899044806", "sm@gmail.com", "Poetry", gradesU1, 123455);
        Student u2 = new Student("Bunny", "Pineva", "0899044807", "bp@gmail.com", "Math", gradesU1, 123456);
        Student u3 = new Student("Lenny", "Mineva", "0899044898", "lm@gmail.com", "Astronomy", gradesU1, 123457);
        Teacher u4 = new Teacher("Viktor", "Todorov", "0899044809", "vt@gmail.com", 5000, classesU4);
        Teacher u5 = new Teacher("Martin", "Dechev", "0899044810", "md@gmail.com", 5100, classesU5);
        Teacher u6 = new Teacher("Malin", "Malinov", "0899044811", "mm@gmail.com", 5200, classesU5);

        users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);
        users.add(u6);

        printStudents();
        printTeachers();
        searchStudentTeacher(u2);
        searchStudent(123455);
        //theRichestTeacher();
        theRichestTeacher2();
    }

    // 1. Метод, който да принтира само студентите и тяхната информация
    public static void printStudents() {
        System.out.println("List of students: ");
        for (User user : users) {
            if (user instanceof Student) {
                user.printUser();
            }
        }
    }

    // 2. Метод, който да принтира само учителите и тяхната информация
    public static void printTeachers() {
        System.out.println("List of teachers: ");
        for (User user : users) {
            if (user instanceof Teacher) {
                user.printUser();
            }
        }
    }

    // 3. Метод, който да изкарва, кой е учителя за неговият клас (имена на учителя)
    public static void searchStudentTeacher(Student student) {
        for (User user : users) {
            if (user instanceof Teacher) {
                for (String currentClass : ((Teacher) user).getClasses()) {
                    if (student.getCurrentClass().equals(currentClass)) {
                        System.out.printf("The teacher for %s is: ", student.getCurrentClass());
                        user.printUser();
                    }
                }
            }
        }
    }

    // 4. Метод, който да изкарва студента след въвеждане на факултетен номер.
    public static void searchStudent(int studentNumber) {
        for (User user : users) {
            if (user instanceof Student) {
                if (((Student) user).getStudentNo() == studentNumber) {
                    System.out.printf("The student with no: %d is: ", studentNumber);
                    user.printUser();
                    break;
                }
            }
        }
    }

    // 5.1 Метод, който да изкарва учителя с най-голяма заплата
    public static void theRichestTeacher2() {
        double biggestSalary = 0;
        User richestTeacher = null;
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user instanceof Teacher) {
                if (((Teacher) user).getSalary() > biggestSalary) {
                    biggestSalary = ((Teacher) user).getSalary();
                    richestTeacher = user;
                }
            }
        }
        System.out.println(richestTeacher);
    }


    // 5.2 Метод, който да изкарва учителя с най-голяма заплата
    public static void theRichestTeacher() {
        double biggestSalary = 0;
        ArrayList<User> theRichestTeacher = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) {
                if (((Teacher) user).getSalary() > biggestSalary) {
                    biggestSalary = ((Teacher) user).getSalary();
                    theRichestTeacher.add(0, user);
                    theRichestTeacher.set(0, user);
                }
            }
        }
        System.out.println(theRichestTeacher.get(0));
    }
}



















