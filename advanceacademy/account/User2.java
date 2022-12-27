package advanceacademy.account;

public class User2 {

    public String fullName;
    public String phoneNumber;
    public Account account;


    public User2(String fullName, String phoneNumber, Account account) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.account = account;
    }

    public void fullInfo () {
        System.out.println("Name: " + this.fullName);
        System.out.println("Phone: " + this.phoneNumber);
        System.out.printf("Money:  %.2f", this.account);
    }

    public void withdraw (double amount) {
        if (amount > this.account.amount) {
            System.out.println("Not enough money in your account");
            return;
        }
        this.account.amount -= amount;
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + this.account);
        System.out.println();
    }

    public void deposit (double amount) {
        this.account.amount = this.account.amount + amount;
        System.out.println("Deposit: " + amount + " BGN");
        System.out.println("Balance: " + this.account + " BGN");
        System.out.println("");
    }
    public void transferTo (User2 receiver, double amount) {
        if (amount > this.account.amount) {
            System.out.println("Not enough money in your account");
            return;}
        this.account.amount = this.account.amount - amount;
        receiver.account.amount = receiver.account.amount + amount;
        System.out.println(amount + " BGN transferred to " + receiver.fullName);
        System.out.println("Balance: " + this.account);
    }
}
