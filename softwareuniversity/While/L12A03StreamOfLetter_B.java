package softwareuniversity.While;

import java.util.Scanner;

public class L12A03StreamOfLetter_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        boolean isC = false;
        boolean isO = false;
        boolean isN = false;
        int countC = 0;
        int countO = 0;
        int countN = 0;


        String output = "";
        String forPrint = "";


        while (!input.equals("End")) {

            boolean valid = input.matches("\\w+");

            if (valid) {

                switch (input) {

                    case "c": {
                        countC++;
                        isC = true;
                        if (countC > 1) {

                            output = output + input;
                        }
                        break;

                    }
                    case "o": {
                        countO++;
                        isO = true;
                        if (countO > 1) {

                            output = output + input;
                        }
                        break;

                    }
                    case "n": {
                        countN++;
                        isN = true;
                        if (countN > 1) {

                            output = output + input;
                        }
                        break;

                    }
                    default: {
                        output = output + input;
                        break;
                    }
                }

                if (isC && isN && isO) {
                    isC = false;
                    isN = false;
                    isO = false;
                    countC = 0;
                    countN = 0;
                    countO = 0;


                    output = output + " ";
                    forPrint = output;

                    //System.out.print(output);
                    //output = "";
                }

                input = scanner.nextLine();

            } else {
               input = scanner.nextLine();
            }
        }



       System.out.println(forPrint);
    }

}
