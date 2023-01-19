package softwareuniversityprogrammingbasics.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L0805Jorney {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()); //• Първи ред – Бюджет, реално число в интервала [10.00...5000.00].
        String season = scanner.nextLine(); //• Втори ред – Един от двата възможни сезона: "summer" или "winter"

//Бюджета определя дестинацията, а сезона определя колко от бюджета ще изхарчи.
// Ако е лято ще почива на къмпинг, а зимата в хотел.
// Ако е в Европа, независимо от сезона ще почива в хотел.
// Всеки къмпинг или хотел, според дестинацията, има собствена цена която отговаря на даден процент от бюджета:

        String destination = "";
        double expenses = 0;
        String campOrHotel = "";
        if (budget <= 100) { //• При 100лв. или по-малко – някъде в България
            destination = "Bulgaria";
            switch (season) {
                case "summer":
                    campOrHotel = "Camp";
                    expenses = budget * 0.3;  //o Лято – 30% от бюджета
                    break;
                case "winter":
                    campOrHotel = "Hotel";
                    expenses = budget * 0.7;  //o Зима – 70% от бюджета
                    break;
            }
        } else if (budget <= 1000) { //• При 1000лв. или по малко – някъде на Балканите
            destination = "Balkans";
            switch (season) {
                case "summer":
                    campOrHotel = "Camp";
                    expenses = budget * 0.4;  //o Лято – 40% от бюджета
                    break;
                case "winter":
                    campOrHotel = "Hotel";
                    expenses = budget * 0.8;  //o Зима – 80% от бюджета
                    break;
            }
        } else if (budget > 1000) { //• При повече от 1000лв. – някъде из Европа
            destination = "Europe";
            campOrHotel = "Hotel";
            expenses = budget * 0.9;  ///o При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.
        }
//• Първи ред – "Somewhere in {дестинация}" измежду "Bulgaria", "Balkans" и "Europe"
//• Втори ред – "{Вид почивка} – {Похарчена сума}"
//o Почивката може да е между "Camp" и "Hotel"
//o Сумата трябва да е закръглена с точност до вторият знак след десетичната запетая
        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", campOrHotel, expenses);
    }
}
