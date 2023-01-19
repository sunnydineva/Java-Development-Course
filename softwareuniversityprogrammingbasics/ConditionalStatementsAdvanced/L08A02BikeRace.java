package softwareuniversityprogrammingbasics.ConditionalStatementsAdvanced;

import java.util.Scanner;

public class L08A02BikeRace {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bikersJunior = Integer.parseInt(scanner.nextLine());
        int bikersSenior = Integer.parseInt(scanner.nextLine());
        String roadType = scanner.nextLine();
        //От конзолата се четат 2 числа и един стринг, всяко на отделен ред:
        //Първият ред – броят младши велосипедисти. Цяло число в интервала [1…100]
        //Вторият ред – броят старши велосипедисти. Цяло число в интервала [1… 100]
        //Третият ред – вид трасе – "trail", "cross-country", "downhill" или "road"
        //Предстои Вело състезание за благотворителност в което участниците са разпределени в младша("juniors") и старша("seniors") група. Парите се набавят от таксата за участие на велосипедистите.
        // Според възрастовата група и вида на трасето на което ще се провежда състезанието, таксата е различна.
        //Група	trail	cross-country	downhill	road
        //juniors	5.50	8	12.25	20
        //seniors	7	9.50	13.75	21.50
        //Ако в "cross-country" състезанието се съберат 50 или повече участника(общо младши и старши), таксата  намалява с 25%.
        // Организаторите отделят 5% процента от събраната сума за разходи.

        double income = 0;

        switch (roadType) {
            case "trail": {
                income = bikersJunior * 5.50 + bikersSenior * 7;
            }
            break;
            case "cross-country": {
                income = bikersJunior * 8 + bikersSenior * 9.50;
                if ((bikersJunior + bikersSenior) >= 50) {
                    income = income - income * 0.25;
                }
            }
            break;
            case "downhill": {
                income = bikersJunior * 12.25 + bikersSenior * 13.75;
            }
            break;
            case "road": {
                income = bikersJunior * 20 + bikersSenior * 21.50;
            }
            break;
        }
        income = income - income * 0.05;
        System.out.printf("%.2f", income);
        //Да се отпечата на конзолата едно число:
        //"{дарената сума}" - форматирана с точност до 2 знака след десетичната запетая.
    }
}
