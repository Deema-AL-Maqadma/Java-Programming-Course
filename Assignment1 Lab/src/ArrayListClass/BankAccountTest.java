package ArrayListClass;

import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.setBalance(60.5);
        System.out.println(b.getBalance());

        BankAccount[] a = new BankAccount[3];
        Scanner k = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = new BankAccount();
            System.out.print("Enter the Balance :");
            double x = k.nextDouble();

        }
        //System.out.println("The Balance=" +x );
        for (BankAccount x : a) {
            System.out.println(x.getBalance());
        }
    }

}
