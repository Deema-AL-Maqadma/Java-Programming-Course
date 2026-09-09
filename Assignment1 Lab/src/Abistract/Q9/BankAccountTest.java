package Abistract.Q9;

public class BankAccountTest {

    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(100, 0.3);
        System.out.println("*** Befor deposit ***");
        System.out.println("b = " + s.getBalance());
        System.out.println("d = " + s.getNumber_of_deposite());
        System.out.println("w = " + s.getNumber_withdrawals());
        System.out.println("*** After deposit ***");
        s.deposite(30);
        s.deposite(20);
        s.deposite(20);
        System.out.println("b = " + s.getBalance());
        System.out.println("d = " + s.getNumber_of_deposite());
        System.out.println("w = " + s.getNumber_withdrawals());
        System.out.println("*** After withdraw ***");
        s.withdraw(100);
        s.withdraw(50);
        s.withdraw(10);
        s.withdraw(1);
        s.withdraw(1);
        System.out.println("b = " + s.getBalance());
        System.out.println("d = " + s.getNumber_of_deposite());
        System.out.println("w = " + s.getNumber_withdrawals());

    }

}
