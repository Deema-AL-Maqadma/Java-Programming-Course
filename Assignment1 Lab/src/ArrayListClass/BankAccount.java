package ArrayListClass;

public class BankAccount {

    private double balance;

    public BankAccount() {
        this(20);
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amaunt) {
        balance += amaunt;
    }

    public void withdrow(double amaunt) {
        balance -= amaunt;
    }

    public double getBalance() {
        return balance;
    }

}
