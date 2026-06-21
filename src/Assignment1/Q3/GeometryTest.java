/** My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة
 * University ID : 2320230766
 * Question (3) //
 */
package Assignment1.Q3;

import java.util.Scanner;

public class GeometryTest {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Geometry x = new Geometry();
        int choice, length, width;
        double r, base, hight;
        do {

            System.out.print("Wellcom to The Geometry Calculater ^_^ "
                    + "\n 1. Calculate the Area of Circle : "
                    + "\n 2. Calculate the Area of Rectangle : "
                    + "\n 3. Calculate the Area of Triangle : "
                    + "\n 4. Quit");
            System.out.print("\nEnter your choice (1-4) : ");
            choice = k.nextInt();
            if (choice >= 1 && choice <= 3) {
                switch (choice) {
                    case 1: {
                        System.out.print("Enter the radius : ");
                        r = k.nextDouble();
                        System.out.println("The area of the Circle =" + x.Area(r));
                    }
                    break;

                    case 2: {
                        System.out.print("Enter the length : ");
                        length = k.nextInt();
                        System.out.print("Enter the width : ");
                        width = k.nextInt();
                        System.out.println("The area of the Rectangle =" + x.Area(length, width));
                    }
                    break;

                    case 3: {
                        System.out.print("Enter the base : ");
                        base = k.nextDouble();
                        System.out.print("Enter the hight : ");
                        hight = k.nextDouble();
                        System.out.println("The area of the Triangle =" + x.Area(base, hight));
                    }
                    break;

                }
            } else if (choice == 4) {
                System.out.println("Thanx *_*\n Goodbye");
            } else {
                System.out.print("Error ! \n please choose a valid choice");
            }

        } while (choice >= 1 && choice <= 3);

    }

}
/**
 * My Name : Deema Mohammed AL-Maqadmaديمة محمد أحمد المقادمة University ID :
 * 2320230766 Question (3) //
 */
