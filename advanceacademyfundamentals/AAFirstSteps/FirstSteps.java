package AAFirstSteps;

public class FirstSteps {
    public static void main(String[] args) {
        averageOf3();
        annualSalary();
        monthlyPayment();

    }
    // Напишете метод, който приема 3 числа и пресмята средно аритметичното число от дадените 3 параметъра.
    // Принтирайте резултата в конзолата.
    public static void averageOf3() {
        double x = 3;
        double y = 4;
        double z = 5;
        double average =  (x + y + z)/3;

        System.out.println("Average of three numbers : " + average);
    }


    //Напишете метод, който има 1 параметър (заплата) и принтира в конзолата след извикване колко е годишната заплата.
    public static void annualSalary() {
        double salary = 2500;
        double annualSalary = salary * 12;
        System.out.println("Annual salary: " + annualSalary);
    }



    //Напишете метод, който приема 2 параметъра сума и период (месеци) и след извикване да принтира в конзолата
    // колко е месечната вноска за даденият период. Добавете годишен лихвен процент от 7 процента.
    // Изкарайте в конзолата колко пари ще върне клиента.
    public static void monthlyPayment(){
        double sum = 10000;
        int months = 10;
        double interest = 0.07;

        double monthlyPrincipal = sum/months;
        double monthlyPayment = monthlyPrincipal + monthlyPrincipal * interest;
        double totalPayment = monthlyPayment * months;
        System.out.println("Total payment:" + totalPayment);

    }

}
