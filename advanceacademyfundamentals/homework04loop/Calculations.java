package advanceacademyfundamentals.homework04loop;

public class Calculations {
    // Напишете 4 метода съответно с по 2 параметъра всеки, които да са две цели числа.
    // Всеки метод ще прави различни действия - съответно събиране, изваждане, деление и умножение.
    public void sumXY(int x, int y) {
        int result = x + y;
        System.out.println("x + y = " + result);
    }

    public void minusXY(int x, int y) {
        int result = x - y;
        System.out.println("x - y = " + result);
    }

    public void divideXY(int x, int y) {
        int result = x / y;
        System.out.println("x : y = " + result);
    }

    public void multiplyXY(int x, int y) {
        int result = x * y;
        System.out.println("x * y = " + result);
    }

    // Направете 5-ти метод, в който само ще извикате всичките други 4 метода.
    // Когато в главния метод извикате петия метод, в конзолата ще се принтират всички резултати от четирите метода,
    // които изчисляват двете числа.
    public void allOperationsXY(int x, int y) {
        System.out.printf("%n All the methods:");
        sumXY(x, y);
        minusXY(x, y);
        divideXY(x, y);
        multiplyXY(x, y);
    }
}




