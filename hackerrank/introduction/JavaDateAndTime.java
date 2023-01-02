package hackerrank.introduction;

import javax.xml.transform.Result;
import java.io.*;
import java.text.DateFormatSymbols;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class JavaDateAndTime {

    //You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

    //The method should return  as the day on that date.

    //findDay function has the following parameters:
    //
    //int: month, int: day, int: year
    //Returns string: the day of the week in capital letters
    //
    //Sample Input
    //08 05 2015
    //Sample Output
    //WEDNESDAY

    static class Result {
        public static String findDay(int month, int day, int year) {
            return new GregorianCalendar(year, --month, day)
                    .getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault())
                    .toUpperCase();
        }

        public static String findDay2(int month, int day, int year) {
            return LocalDate.of(year, month, day)
                    .getDayOfWeek().name();
        }

        public static String findDay3(int month, int day, int year) {
            String dayNames[] = new DateFormatSymbols().getWeekdays();//DateFormatSymbols().getWeekdays()' method returns the name of the weekdays in a string format as array
            Calendar c = Calendar.getInstance(); //Then the Calendar instance is created and set according to the input format.
            c.set(year, month - 1, day); //The value of month starts from 0 to 11 that's why month -1.
            return dayNames[c.get(Calendar.DAY_OF_WEEK)].toUpperCase(); //returns integer acc to day no. in week. Then converted to uppercase.
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);
        int day = Integer.parseInt(firstMultipleInput[1]);
        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);
        //String res = Result.findDay2(month, day, year);
        //String res = Result.findDay3(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
