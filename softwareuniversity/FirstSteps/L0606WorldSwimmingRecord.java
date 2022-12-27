package ConditionalStatements;

public class L0606WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);



        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeFor1mtr = Double.parseDouble(scanner.nextLine());

        double speedIvan = distance / timeFor1mtr;
        double secondsSlower = speedIvan - record;
        double ivanTime = distance / speedIvan;

        //съпротивлението на водата го забавя на всеки 15 м. с 12.5

        //Да се изчисли времето в секунди, за което Иван ще преплува разстоянието и разликата спрямо Световния
        //рекорд.
        if () {

            //System.out.printf("Yes, he succeeded! The new world record is {времето на Иван} seconds."

        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", secondsSlower);
//        Резултатът трябва да се форматира до втория знак след десетичната запетая.


        }


    }
