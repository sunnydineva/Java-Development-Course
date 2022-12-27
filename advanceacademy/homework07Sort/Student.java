package advanceacademy.homework07Sort;

public class Student extends User {
    // Студентът има текущ клас и масив с оценки, факултетен номер
    private String currentClass = "";
    private int grades[] = {};
    private int studentNo = 0;

    public Student(String firstName, String lastName, String phone, String email, String currentClass, int grades[], int studentNo) {
        super(firstName, lastName, phone, email);
        this.grades = grades;
        this.currentClass = currentClass;
        this.studentNo = studentNo;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String toString(){
        return "Student " + getStudentNo();
    }
}


