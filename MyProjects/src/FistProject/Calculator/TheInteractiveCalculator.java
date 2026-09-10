/**
 * My name is : Deema Mohammed AL Maqadma . Welcome to my project [ The
 * Interactive Calculator ] I wish you benefit and have fun ×_×
 *
 * Go A Hero !
 */
package FistProject.Calculator;

import java.util.Scanner;    //To make a Scanner class available

public class TheInteractiveCalculator {

    public static void main(String[] args) {

        Scanner deema = new Scanner(System.in);  //To creat a Scanner object
        int choice;   //Choice variable of type int to carry the selection number of user

        do {
            // To view the operations list to the user
            System.out.println("Welcome to The Interactive Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter the number of your chosen operation from the menu above : ");

            // To enter a value from the user
            choice = deema.nextInt();

            if (choice >= 1 && choice <= 4) {
                // Request to enter two digits from the user
                System.out.print("Enter the first number: ");
                double num1 = deema.nextDouble();
                System.out.print("Enter the second number:");
                double num2 = deema.nextDouble();

                switch (choice) {
                    case 1: // Addition
                        System.out.println("result : " + (num1 + num2));
                        break;
                    case 2: // Subtraction
                        System.out.println("result : " + (num1 - num2));
                        break;
                    case 3: // Multiplication
                        System.out.println("result : " + (num1 * num2));
                        break;
                    case 4: // Division
                        if (num2 != 0) {
                            System.out.println("result : " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division on zero is not allowed.");
                        }
                        break;
                }
            } else if (choice != 5) {
                // Dealing with an invalid list selection
                System.out.println("Selection is invalid. Please choose a valid option.");
            }
        } while (choice != 5);

        System.out.println("Thanks for using The Interactive Calculator.\n Goodbye ^_^.");
        deema.close();
    }

} // # The_END ✓ 

