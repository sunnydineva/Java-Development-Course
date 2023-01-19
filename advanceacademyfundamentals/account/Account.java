package advanceacademyfundamentals.account;

public class Account {
    public double amount;
    public String iban;
    public String currency;

    public Account(double amount, String iban, String currency) {
        this.amount = amount;
        this.iban = iban;
        this.currency = currency;
    }
    public void printAccountInfo() {
        System.out.println("AdvanceAcademy.Account.Account information:");
        System.out.println("Amount: " + this.amount + " " + this.currency);
        System.out.println("Currency: " + this.currency);
        System.out.println("IBAN: " + this.iban);
    }
}

