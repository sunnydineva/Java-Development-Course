package softwareuniversity.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A04CarToGo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double budget = Double.parseDouble(scanner.nextLine());
    String season = scanner.nextLine();

    String carType = "";
    String carClass = "";
    double budgetPercent = 0;


    if (budget <= 100) {
        carClass = "Economy class";
        switch (season) {
            case "Summer": {
                carType = "Cabrio";
                budgetPercent = 35;
            }
            break;
            case "Winter": {
                carType = "Jeep";
                budgetPercent = 65;
            }
        }
    } else if (budget <= 500)    {
        carClass = "Compact class";
        switch (season) {
            case "Summer": {
                carType = "Cabrio";
                budgetPercent = 45;
            }
            break;
            case "Winter": {
                carType = "Jeep";
                budgetPercent = 80;
            }
        }
    } else {
        carClass = "Luxury class";
        carType = "Jeep";
        budgetPercent = 90;
    }

    double carPrice = budget * budgetPercent * 0.01;

    System.out.println(carClass);
    System.out.printf("%s - %.2f", carType, carPrice);

//    Първи ред – "{Вид на класа}"
//o"Economy class", "Compact class" или "Luxury class"
//Втори ред – "{Вид на колата} - {цена на колата}"
//oВидът на колата – "Cabrio" или "Jeep"
//oЦената трябва да е форматирана до втория знак след запетаята
    }
}
