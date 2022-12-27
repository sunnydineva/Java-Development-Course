package advanceacademy.homework11Excersise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main11 {
    public static void main(String[] args) {

        //Направете обект Date който да принтира датата във формат "12.12.21"
        Date date1 = new Date();
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd.MM.yy"); //създаваме своя formatter
        String formattedDate1 = formatter1.format(date1); //чрез метода format на formatter-а ни преформатираме датата
        System.out.println(formattedDate1);

        //Направете обект Date който да принтира датата във формат "12.12.21 20:30:22"
        Date date2 = new Date();
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd.MM.yy HH:mm:ss");
        String formattedDate2 = formatter2.format(date2);
        System.out.println(formattedDate2);

        //Направете обект Date който да принтира датата във формат "Jan 25"
        Date date3 = new Date();
        SimpleDateFormat formatter3 = new SimpleDateFormat("MMM yy");
        String formattedDate3 = formatter3.format(date3);
        System.out.println(formattedDate3);

        //Направете обект Date който да принтира датата във формат "December, Monday 25"
        Date date4 = new Date();
        SimpleDateFormat formatter4 = new SimpleDateFormat("MMMM, EEEE 25");
        String formattedDate4 = formatter4.format(date4);
        System.out.println(formattedDate4);

        //Направете обект Date който да принтира датата във формат "January, 25 Monday, 22:05"
        Date date5 = new Date();
        SimpleDateFormat formatter5 = new SimpleDateFormat("MMMM, dd EEEE, HH:mm");
        String formattedDate5 = formatter5.format(date5);
        System.out.println(formattedDate5);

        // Направете обект Date от String който е "2021-12-24" и го принтирайте
        String dateToParse1 = "2021-12-24";
        SimpleDateFormat formatter6 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate1 = formatter6.parse(dateToParse1);
            System.out.println(parsedDate1);
        } catch (Exception e) {
            System.out.println("op");
        }

        // Направете обект Date от String който е "24.12.21" и го принтирайте
        String dateToParse2 = "24.12.21";
        SimpleDateFormat formatter7 = new SimpleDateFormat("dd.MM.yy");
        try {
            Date parsedDate2 = formatter7.parse(dateToParse2);
            System.out.println(parsedDate2);
        } catch (Exception e) {
            System.out.println("op");
        }

    }
}






















