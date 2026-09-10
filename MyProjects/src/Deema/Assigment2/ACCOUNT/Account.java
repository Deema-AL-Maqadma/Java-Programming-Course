/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 */
package Deema.Assigment2.ACCOUNT;

public class Account {

    private String name;
    private double balance;
    private static double yearlyInterestRate = 0.05;

    public Account() {
        this("MyAccount", 5000.0);
    }

    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("ERROR !!!\nBalance cannot be zero or negative.\nSetting default balance to 5000.0.");
            this.balance = 5000.0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be zero or negative.");
        }
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amaunt) {
        balance += amaunt;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful, New balance: " + this.balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (this.balance * yearlyInterestRate) / 12;
        this.balance += monthlyInterest;
    }

    public static void modifyYearlyInterestRate(double newRate) {
        yearlyInterestRate = newRate;
    }
}
/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 */
