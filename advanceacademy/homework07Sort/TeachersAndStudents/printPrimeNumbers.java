package advanceacademy.homework07Sort.TeachersAndStudents;

public class printPrimeNumbers {

    public static void main(String[] args) {
        printPrimeNumbers(100);
    }
    public static void printPrimeNumbers(int number) {
        for (int i = 0; i <= number; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {// проверка за естествени делители
                    counter++;
                }
            }
            if (counter == 2) { // проверка дали е просто число - само с 2 делителя
                System.out.printf(i + " ");
            }
        }
    }
}


