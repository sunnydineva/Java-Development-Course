package advanceacademy.homework06;

public class smallShop {
    //Голям проблем е за малките магазини, които са без система да смятат колко ресто трябва да се връща.
    // Напишете функция, която да приема 2 параметъра - масив от цени на продукти, които човекът си е избрал
    // и сума, която плаща. Изкарайте в конзолата колко ресто трябва да се върне.
    // Във функцията сумирайте цените на продуктите и ги сравнете със сумата, която клиентът е оставил.
    //Ако парите са по-малко, изкарайте "Парите не стигат трябва да оставите още X лева".
    //Ако парите са точно, изкарайте "Благодаря, хубав ден".
    //Ако са повече изкарайте "Ресто: X лева".
    //(Тази задача, може да се направи и без фунцкия, като им са предварително дадени сумата и масива със цени)
    // var price = [10, 23, 4, 2, 3, 4] и var amount = 200

    public static void main(String[] args) {
        double prices[] = {1.50, 6.50, 3.30, 4.50, 22.99};
        calculateChange(prices, 30);

    }
    public static void calculateChange(double products[], double money) {
        double sumProducts = 0;
        for (double price : products) {
           sumProducts += price;

        }
        if (money > sumProducts) {
            System.out.println("Change: " + (money - sumProducts) + "BGN");
        } else if (money == sumProducts) {
            System.out.println("Have a nice day");
        } else {
            System.out.println("We need more money: " + (sumProducts - money) + "BGN");
        }


       }

}
