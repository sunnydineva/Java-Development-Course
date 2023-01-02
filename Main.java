import advanceacademyoop.stringManipulator.StringManipulatorInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("a", "bb", "c");

        for(String string : list){
            if(string.length() > 1){
                System.out.println(string);
            }
        }

        List<String> list1 = list.stream()
                .filter(e-> e.length() > 1)
                //.forEach(e-> System.out.println(e))
                .collect(Collectors.toList());


        Scanner scanner = new Scanner(System.in);

        int myInt = Integer.parseInt(scanner.nextLine());
        double myDouble2 = Double.parseDouble(scanner.nextLine());
        String myString = scanner.nextLine();

        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble2);
        System.out.println("Int: " + myInt);


    }
}
