/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة
 * University ID : 2320230766
 * Question (1) //
 */
package Assignment1.Q1;

import java.util.Scanner;

public class DistanceTest {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the number of feet : ");
        double f = k.nextDouble();
        System.out.print("Enter the number of inches : ");
        double i = k.nextDouble();

        Distance d1 = new Distance();
        Distance d2 = new Distance(f, i);
        Distance d3 = new Distance(d2);

        System.out.println(d2.toString());

    }

}


/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة     
 * University ID : 2320230766
 * Question (1) //
 */
