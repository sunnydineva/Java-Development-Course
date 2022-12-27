package advanceacademy.homework10Exercises;

import java.util.ArrayList;

public class Main11 {
    public static ArrayList<Account> accounts;

    public static void main(String[] args) {

        // Test constructor and toString()
        Customer e1 = new Customer(1, "Viktor", 'm');
        Customer e2 = new Customer(2, "Ema", 'f');
        Customer e3 = new Customer(3, "Badema", 'f');

        Account a1 = new Account(91, e1, 2000);
        Account a2 = new Account(92, e2, 1000);
        Account a3 = new Account(93, e3, 5000);


        accounts = new ArrayList<>();
        accounts.add(a1);
        accounts.add(a2);
        accounts.add(a3);


        //stringTimes("Hi", 2);
        //stringTimes("Hi", 3);
        //stringTimes("Hi", 1);
        //evenOdd(10);
        underValue(800);
        //maxSum();
        //printCustomers();
        //searchAccountsByID("91");
        //searchAccountsByName("Viktor");
        //transfer(a3, 1000, a1);


    }

    public static void evenOdd(int limit) {
        System.out.println("Even:");

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Odd:");
        for (int i = 1; i <= limit; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void underValue(double max) {

        double amounts[] = {800.53, 753.22, 1344.33, 111.44};
        double value = Double.MAX_VALUE;
        ArrayList<Double> values = new ArrayList();
        for (double amount : amounts) {
            if (amount < max) {
                values.add(amount);
            }
        }
        System.out.println(values);
    }

    public static void maxSum() {

        double amounts[] = {400.53, 553.22, 344.33, 111.44};
        double maxSum = Double.MIN_VALUE;
        for (int i = 0; i < amounts.length; i++) {
            double currentAmount = amounts[i];
            if (currentAmount > maxSum) {
                maxSum = currentAmount;
            }

        }
        System.out.println(maxSum);
    }


    public static String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        System.out.println(result);
        return str;

    }


    public static void printCustomers() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }

    public static void searchAccountsByID(String accountID) {
        for (Account account : accounts) {
            if (String.valueOf(account.getID()).equals(accountID)) {
                System.out.println(account);
                break;
            }
        }
    }

    public static Account searchAccountsByName(String name) {
        Account accountByName = null;
        for (Account account : accounts) {
            if (account.getCustomerName().equals(name)) {
                System.out.println(account);
                accountByName = account;
                break;
            }
        }
        return accountByName;

    }

    public static void showHighestBalance() {
        double highestBalance = 0;
        for (Account account : accounts) {
            if (account.getBalance() > highestBalance) {
                highestBalance = account.getBalance();
            }
        }

    }

    public static void transfer(Account fromAccount, double amount, Account toAccount) {
        for (Account account : accounts) {
            if (account == fromAccount) {
                account.withdraw(amount);
                System.out.println("Balance after transfer: " + account.getBalance());
                break;
            }
        }
        for (Account account : accounts) {
            if (account == toAccount) {
                account.deposit(amount);
                System.out.println("Balance after receipt: " + account.getBalance());
                break;
            }
        }
    }


}






















