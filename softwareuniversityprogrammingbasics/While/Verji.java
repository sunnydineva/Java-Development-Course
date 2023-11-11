package softwareuniversityprogrammingbasics.While;

import java.util.Scanner;
//Изпит по "Основи на програмирането" – 15 и 16 юни 2019
//Задача 4. Кино От кино ви наемат да напишете програма, чрез която да разберете дали на една прожекцията ще се запълни залата и колко пари ще се изкарат от нея. Получавате места в залата и на всеки следващ ред до команда "Movie time!", колко хора влизат в залата. Цената на един билет е 5 лв. Ако текущия брой хора влезли в залата се дели на 3 без остатък, се прави отстъпка 5лв от общата им сметка. Ако в залата се опитат да влязат повече хора от колкото места са останали, то се счита че местата са изчерпани и програмата трябва да приключи четенето на вход.
//Вход
//От конзолата се четат:
// На първия ред - капацитет на залата - цяло число в интервала [50... 150]
//На всеки следващ ред до команда "Movie time!":
//o Брой хора влизащи в киното - цяло число в интервала [1… 15]
//Изход
//На конзолата първо да се отпечата един ред:
// При получена команда "Movie time!":
//"There are {останали места} seats left in the cinema."
// При изчерпване на местата в залата:
//"The cinema is full."
//След това да се отпечата:
//"Cinema income - {приходи от залата} lv."
//Примерен вход и изход Вход Изход Обяснения
//60
//10
//6
//3
//20
//15
//Movie time!
//There are 6 seats left in the cinema.
//Cinema income - 255 lv.
//Първо получаваме капацитет на залата - 60 места. На следващият ред получаваме хората, които са влезли в залата - 10.
public class Verji {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hallCapacity = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        double totalIncome = 0;
        boolean isFull = false;

        String input = scanner.nextLine();

        while (!input.equals("Movie time")) {

            int num = Integer.parseInt(input);

            sum += num;

            if (sum > hallCapacity) {
                isFull = true;
                break;
            }

            if (num % 3 == 0) {
                totalIncome += num * 5 - 5;
            } else {
                totalIncome += num * 5;
            }
            input = scanner.nextLine();
        }
        int remainingSeats = hallCapacity - sum;

        if(isFull){
            System.out.println("The cinema is full.");

        } else {
            System.out.printf("There are %d seats left in the cinema.%n", remainingSeats);
        }

        System.out.printf("Cinema income - %.0f lv.", totalIncome);

    }
}