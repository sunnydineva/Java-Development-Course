package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A08PointOnRectangleBorder {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double x1 = Double.parseDouble(scanner.nextLine());
    double y1 = Double.parseDouble(scanner.nextLine());
    double x2 = Double.parseDouble(scanner.nextLine());
    double y2 = Double.parseDouble(scanner.nextLine());
    double x = Double.parseDouble(scanner.nextLine());
    double y = Double.parseDouble(scanner.nextLine());

    String position = "";

    if ((((x == x1) || (x == x2)) && ((y >= y1) && (y <= y2))) ||
        (((y == y1) || (y == y2)) && ((x >= x1) && (x <= x2))))
        {
        position = "Border";

    } else {
        position = "Inside / Outside";
    }
        System.out.println(position);
        // Точка {x, y} лежи върху някоя от страните на правоъгълник {x1, y1} – {x2, y2}, ако е изпълнено едно от следните условия:
        //x съвпада с x1 или x2 и същевременно y е между y1 и y2
        //y съвпада с y1 или y2 и същевременно x е между x1 и x2
        //Можете да проверите горните условия с една по-сложна if-else конструкция или с няколко по-прости проверки или с вложени if-else проверки.
    }


}
