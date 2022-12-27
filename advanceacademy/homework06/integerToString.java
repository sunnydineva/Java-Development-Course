package advanceacademy.homework06;

public class integerToString {
    public static void main(String[] args) {
        //Средна: Напишете метод, който да приема един параметър число тип int и връща String,
        // който съдържа всяка една цифра от този int повдигната на 2- ра степен.
        // Пример викаме метода и въвеждаме числото 245 метода трябва да принта следният
        // String "41625", защото 2*2 е 4, 4*4 е 16 и 5*5 е 25.
        // Ако успеете после този String го обърнете в int и него.
    toStringPow2(245);
    toStringPow2Viktor(245);
    }
    public static void toStringPow2 (int input) {
        String inputString = Integer.toString(input);
        String outputString = "";
        int output = 0;
        for (int i = 0; i < inputString.length(); i++) {
            int digit = input % 10;             //= 5 взимам последната
            output = digit * digit;
            outputString = new StringBuilder().append(Integer.toString(output)).append(outputString).toString();
            input = input / 10;   //24 махам последната
        }
        System.out.printf("%nThis is the outputString: " + outputString);

        int outputInteger = Integer.parseInt(outputString);
        System.out.printf("%nThis is the outputInteger: " + outputInteger);
    }
    public static int toStringPow2Viktor (int number) {
        char numbers [] = Integer.toString(number).toCharArray();
        String result = "";
        for (char n : numbers) {
            result += (Character.getNumericValue(n) * Character.getNumericValue(n));
        }
        System.out.println();
        System.out.println(result);
        int finalResult = Integer.parseInt(result);
        return finalResult;
    }


}
