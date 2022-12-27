package softwareuniversity.ConditionalStatements;

import java.util.Scanner;

public class L0504PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String passwordGuess = String.valueOf(scan.nextLine());
        String password = "s3cr3t!P@ssw0rd";
        boolean Try;
        Try = passwordGuess.equals(password);
        if (Try)
        System.out.println("Welcome");
        else
        System.out.println("Wrong password!");
        }
}