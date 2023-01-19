package advanceacademyfundamentals.homework06;

public class tipInRestaurant {
    //Направете функция, която да ви помогне ако сте на ресторант и се колебаете, колко пари бакшиш да оставите.
    // Функцията трябва да има два параметъра обща сума на сметката и процент, който желаем да оставим
    // (все пак в САЩ е 20%, на други места е 10%, трябва да я направим интернационална).
    // Резултатът в конзолата трябва да бъде "За сметка от 200 лева трябва да оставите 30 лева".
    public static void main(String[] args) {
        calculateTip (200, 15);
    }
    public static void calculateTip(double bill, double percent) {
     double tip = bill * percent * 0.01;
     System.out.printf("The advisable tip is %.2f (Bill's currency)", tip);

    }

}
