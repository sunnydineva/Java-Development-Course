package advanceacademyfundamentals.homework06Arrays2;

import java.util.ArrayList;

public class Homework06 {
    public static void main(String[] args) {

        String likes[] = {"Sunny", "Ema", "Ves", "Lili", "Mimi"};
        facebookLikes(likes); //1

        ArrayList<Double> prices = new ArrayList<>();
        prices.add(10.0);
        prices.add(23.0);
        prices.add(4.0);
        prices.add(2.0);
        prices.add(3.0);
        prices.add(4.0);
        smallShopChange(prices, 200); //2

        calculatedTip(200, 15); //3

        censoredWord1("Hello, can you translate this message?"); //4
        censoredWord2("Hello, can you translate this message?"); //4

        numberRaised(100, 2); //5

        intRaisedEveryDigit(245); //6

    }
    // 1. Сигурно сте наясно как работи "Like" системата на Facebook. Хората могат да харесват публикации, снимки и други.
    // Ние искаме да направим текста, който се показва, когато харесаме дадена публикация.
    // Напишите функция "likes", която приема масив с имена и връща текст, който съответно е:
    // Ако в масива няма имена -> "no one likes this"
    // Ако в масива има 1 име пример "Ani" -> "Ani likes this"
    // Ако в масива има 2 имена -> "Ani and Viktor like this"
    // Ако в масива има 3 имена -> "Ani, Viktor and John like this"
    // Aко в масива има повече от 3 имена -> "Ani, Viktor and 4 others like this"
    // (като пример ако има 10 имена, се изписват първите 2 имена и след това бройката на останалите
    // "Ani, Viktor and 8 others like this")
    public static void facebookLikes(String[] likes){
        if(likes.length == 0) {
            System.out.println("no one likes this");
        } else if (likes.length == 1) {
            System.out.printf("%s likes this", likes[0]);
        } else if (likes.length == 2) {
            System.out.printf("%s and %s likes this", likes[0], likes[1]);
        } else {
            System.out.printf("%s, %s and %d others likes this", likes[0], likes[1], (likes.length - 2));
        }
    }

    //2. Голям проблем е за малките магазини, които са без система да смятат колко ресто трябва да се връща.
    // Напишете функция, която да приема 2 параметъра - масив от цени на продукти, които човекът си е избрал
    // и сума, която плаща. Изкарайте в конзолата колко ресто трябва да се върне.
    // Във функцията сумирайте цените на продуктите и ги сравнете със сумата, която клиентът е оставил.
    // Ако парите са по-малко, изкарайте "Парите не стигат трябва да оставите още X лева".
    // Ако парите са точно, изкарайте "Благодаря, хубав ден".
    // Ако са повече изкарайте "Ресто: X лева".
    // (Тази задача, може да се направи и без фунцкия, като им са предварително дадени сумата и масива със цени)
    // var price = [10, 23, 4, 2, 3, 4] и var amount = 200
    public static void smallShopChange(ArrayList<Double> prices, double amount){
        double totalPrice = 0;
        for (Double price : prices)
            totalPrice += price;
        if (amount < totalPrice) {
            System.out.printf("%nNot enough money. You need %.2fBGN more", totalPrice - amount);
        } else if (amount > totalPrice) {
            System.out.printf("%nThank you for your payment, Your change is %.2f BGN", amount - totalPrice);
        } else {
            System.out.println("%nThank you for your payment. Have a nice day");
        }
    }

    // 3. Направете функция, която да ви помогне ако сте на ресторант и се колебаете, колко пари бакшиш да оставите.
    // Функцията трябва да има два параметъра обща сума на сметката и процент, който желаем да оставим
    // (все пак в САЩ е 20%, на други места е 10%, трябва да я направим интернационална).
    // Резултатът в конзолата трябва да бъде "За сметка от 200 лева трябва да оставите 30 лева".
    public static void calculatedTip (double totalSum, int percentTip) {
        double calculatedTip = totalSum * percentTip * 0.01;
        System.out.printf("%nThe %d%% tip for the %.2f should be %.2f", percentTip, totalSum, calculatedTip);
    }

    // 4. Трудна: Имаме работеща система (Социална мрежа) и следим в коментарите на потребителите
    // дали се използват вулгарни думи. Направете метод, който да приема само един параметър тип String
    // и принтира в конзолата същият String, но без гласните букви.
    // За тази задача можете свободно да използвате интернет и да разгледате решенията там.
    // Обсъдете помежду си, кое решение е най-добро и най-лесно. Пример:
    //"Hello, can you translate this message?" - "Hll, cn trnslt ths mssg?"
    public static void censoredWord1(String inputWords) {
        inputWords = inputWords.replaceAll("[a, e, i, o, u, y, A, E, I, O, U, Y]", "");
        System.out.println();
        System.out.println(inputWords);
    }
    public static void censoredWord2(String inputWords) {
        char vowels[] = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y', };
        for (int i = 0; i < inputWords.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (inputWords.charAt(i) == vowels[j]) {
                   inputWords = inputWords.replace(inputWords.charAt(i), '*');
                }
            }
        }
        System.out.println(inputWords);
    }

    //5. Лесна: Напишете метод, който да вдига на 2-ра степен всички четни числа от 0 до 100
    public static void numberRaised (double number, double pow) {
        System.out.printf("List of every even numbers from 1 to %.0f raised to the power of %.0f:%n", number, pow);
        for (int i = 1; i <= number ; i++) {
            if(i % 2 == 0) {
                System.out.printf("%.0f ", Math.pow(i, pow));
            }
        }
    }


    // 6. Средна: Напишете метод, който да приема един параметър число тип int и връща String,
    // който съдържа всяка една цифра от този int повдигната на 2- ра степен. Пример викаме метода и въвеждаме
    // числото 245 метода трябва да принта следният String "41625", защото 2*2 е 4, 4*4 е 16 и 5*5 е 25.
    // Ако успеете после този String го обърнете в int и него.
    public static String intRaisedEveryDigit(int number){
        String inputString = Integer.toString(number);
        String outputString = "";
        int output = 0;
        for (int i = 0; i < inputString.length(); i++) {
            int digit = number % 10; //245 ---> 5 взимам последната
            output = digit * digit;
            outputString = new StringBuilder().append(Integer.toString(output)).append(outputString).toString();
            number = number / 10;   //--> 24 махам последната
        }


        int outputInteger = Integer.parseInt(outputString);
        System.out.printf("%nThis is the outputInteger: " + outputInteger);
        return outputString;
    }

}










