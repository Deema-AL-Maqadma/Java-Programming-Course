package ArrayListClass;
//import java.util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<BankAccount> B = new ArrayList<>();
        B.add(0, new BankAccount());
        B.add(1, new BankAccount());
        System.out.println(B);
        B.get(0).setBalance(500.0);
        System.out.println(B.get(0).getBalance());
        Scanner k = new Scanner(System.in);
        for (int i = 2; i < 5; i++) {
            B.add(new BankAccount());
            System.out.print("Enter the Balance :");
            double x = k.nextDouble();
            System.out.println("The Balance = " + B.get(i).getBalance());

        }

        System.out.println("***********************************************");
        ArrayList<String> name = new ArrayList<>();
        name.add("Deema");
        name.add("Zain");
        name.add("Basmala");
        System.out.println("The size = " + name.size());
        System.out.println("The name in possition 1 : " + name.get(1));
        System.out.println(name);
        for (int i = 0; i < name.size(); i++) {
            System.out.println("The name in the index " + i + " =" + name.get(i));

        }
        System.out.println(name.get(2));
    }

}
