/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 */
// https://youtu.be/AGu-v54WGlM?si=or4ZZowJ8CXis-wX رابط فيديو اليوتيوب
package Deema.Assigment2.ACCOUNT;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Account acc1 = new Account();
        Account acc2 = new Account("MyAccount2", 90000.0);

        Account.modifyYearlyInterestRate(0.05);

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(acc1);
        accounts.add(acc2);

        for (int i = 1; i <= 12; i++) {
            for (Account acc : accounts) {
                acc.calculateMonthlyInterest();
                System.out.println("Month " + i + " : " + acc.getName()
                        + " ,Balance:" + acc.getBalance());
            }
        }
        System.out.println("\n\n***********************************************\n\n");

        acc1.deposit(1000);
        acc2.withdraw(10000);
        System.out.println("\n\n***********************************************\n\n");

        Account.modifyYearlyInterestRate(0.15);
        System.out.println("------------> The Balance after modifying <------------\n");
        for (int i = 1; i <= 12; i++) {
            for (Account acc : accounts) {
                acc.calculateMonthlyInterest();
                System.out.println("Month " + i + "(New Rate): " + acc.getName()
                        + " ,Balance: " + acc.getBalance());

            }
        }

        System.out.println("\n\n***********************************************\n\n");
        System.out.println("-----------> Add new Account <-----------");
        Scanner k = new Scanner(System.in);
        System.out.print("Enter name for new account: ");
        String name = k.nextLine();
        System.out.print("Enter initial balance for new account: ");
        double balance = k.nextDouble();
        Account newAcc = new Account(name, balance);
        accounts.add(newAcc);
        System.out.println("New account added: " + newAcc.getName()
                + " ,with balance: " + newAcc.getBalance());
        System.out.println("Thx , Good Job ^_^");
    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
