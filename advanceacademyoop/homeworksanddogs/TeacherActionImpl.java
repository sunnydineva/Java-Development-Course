package advanceacademyoop.homeworksanddogs;

import java.util.List;
import java.util.Map;

public class TeacherActionImpl implements TeacherActions {
    @Override
    public void askForHW(Teacher teacher, List<Student> students, List<Dog> dogs) {
        teacher.introduce();
        for (Subject subject : teacher.getSubjects()) { //for every teacher's subject
            System.out.println();
            System.out.println("Now we will have " + subject.label + ".");

            for (Student student : students) { //for all students in class
                if (student.getGrades().containsKey(subject)) { //checks is the student studying this subject
                    for (Map.Entry<Subject, Integer> gradeEntry : student.getGrades().entrySet()) {
                        //student's grade for this subject will be affected

                        if (gradeEntry.getKey().label.equals(subject.label)) {    //checks the subject
                            System.out.println();
                            System.out.println(student.getName() + ", please, give me your homework. " +
                                    "Your last grade is " + gradeEntry.getValue() + ".");
                            StudentAction studentAction = new StudentActionImpl();
                            if (studentAction.isWritten()) { //checks is the homework is written

                                if (gradeEntry.getValue() < 6) { //max grade
                                    gradeEntry.setValue(gradeEntry.getValue() + 1); //increases the grade
                                    System.out.println("Well done, you got " + gradeEntry.getValue() + " now.");
                                } else {
                                    System.out.println("Good. Still 6 :)"); // no change of grade
                                }
                                break;
                            } else { // the homework is not written
                                for (Dog dog : dogs) {
                                    if (dog.getOwner().getName().equals(student.getName())) {//finds the dog of the student
                                        dog.confess();
                                        break;
                                    }
                                }
                                if (gradeEntry.getValue() > 2) { //min grade
                                    gradeEntry.setValue(gradeEntry.getValue() - 1); //decreases the grade
                                    System.out.println("I'm sorry, that your dog ate your homework. You got "
                                            + gradeEntry.getValue() + ".");
                                } else {
                                    System.out.println("At least you can not get worse than 2."); // no change of grade
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
