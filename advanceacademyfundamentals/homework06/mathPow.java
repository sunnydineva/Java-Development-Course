package advanceacademyfundamentals.homework06;

public class mathPow {
    public static void main(String[] args) {

        //Лесна: Напишете метод, който да вдига на 2-ра степен всички четни числа от 0 до 100

        evenPow2(100);

    }
    public static void evenPow2 (int number){
        double result = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                result = Math.pow(i, 2);
                System.out.printf("%.0f%n", result);
            }
        }

    }
}
