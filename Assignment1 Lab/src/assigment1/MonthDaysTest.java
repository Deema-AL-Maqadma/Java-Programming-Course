// Deema Mohammed AL-Maqadma
package assigment1;

import java.util.Scanner;

public class MonthDaysTest {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = k.nextInt();

        System.out.print("Enter a year: ");
        int year = k.nextInt();

        if (month > 0 && month < 13) {
            MonthDays m = new MonthDays(month, year);
            System.out.println(m.getNumberOfDays());
        } else {
            System.out.println("Invalid month entered.");
        }

        k.close();
    }

}
