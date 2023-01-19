package softwareuniversityprogrammingbasics.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0806OperationsBetweenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Напишете програма, която чете две цели числа (N1 и N2) и оператор, с който да се извърши дадена
//математическа операция с тях. Възможните операции са: Събиране (+), Изваждане (-), Умножение (*),
//Деление (/) и Деление с остатък (%). При събиране, изваждане и умножение на конзолата трябва да се
//отпечата резултатът и дали той е четен или нечетен. При обикновеното деление – резултатът. При модулното
//деление – остатъка. Трябва да се има предвид, че делителят може да е равен на 0(нула), а на нула не се дели.
//В този случай трябва да се отпечата специално съобщениe.

        int n1 = Integer.parseInt(scanner.nextLine()); //• N1 – цяло число в интервала [0...40 000]
        int n2 = Integer.parseInt(scanner.nextLine()); //• N2 – цяло число в интервала [0...40 000]
        String operator = scanner.nextLine(); //• Оператор – един символ измеду: "+", "-", "*", "/", "%"
        double result = 0;
        String evenOrOdd = "";
        boolean isZero = false;

        switch (operator) {
            case ("+"):
                result = n1 + n2;
                break;
            case ("-"):
                result = n1 - n2;
                break;
            case ("*"):
                result = n1 * n2;
                break;
            case ("/"):
                if (n2 == 0) {
                    isZero = true;
                } else {
                    result = n1 * 1.0 / n2;
                }
                break;
            case ("%"):
                if (n2 == 0) {
                    isZero = true;
                } else {
                    result = n1 % n2;
                }
                break;
        }
//Да се отпечата на конзолата един ред:
//• Ако операцията е събиране, изваждане или умножение:
//o "{N1} {оператор} {N2} = {резултат} – {even/odd}"

        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }
        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf(" %d %s %d = %.0f - %s", n1, operator, n2, result, evenOrOdd);
        } else if (operator.equals("/") && !isZero) {
            System.out.printf("%d / %d = %.2f", n1, n2, result);
        } else if (operator.equals("%") && !isZero) {
            System.out.printf("%d %% %d = %.0f", n1, n2, result);
        } else {
            System.out.printf("Cannot divide %d by zero", n1);
        }
//• Ако операцията е деление:
//o "{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
//• Ако операцията е деление с остатък:
//o "{N1} % {N2} = {остатък}"
//• В случай на деление с 0 (нула):
//o "Cannot divide {N1} by zero"
    }
}
