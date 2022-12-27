package advanceacademy.homework10Exercises;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.customer.getName() + "(" + this.getID() + ")" +
                 " balance=$" + String.format("%.2f", this.balance);

    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit(double amount){
        this.balance += amount;
        //return ;
    }

    public void withdraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
        } else {
            System.out.println("amount exceed the current balance!");
        }
    }






}
