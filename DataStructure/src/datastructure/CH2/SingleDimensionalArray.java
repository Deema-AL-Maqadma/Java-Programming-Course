package datastructure.CH2;

import java.util.Scanner;

public class SingleDimensionalArray {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int size = 0;
        Scanner in = new Scanner(System.in);
        boolean UserSelect = true;
        while (UserSelect) {
            System.out.println("...Array Operation...");
            System.out.println("1.Add");
            System.out.println("2.Display");
            System.out.println("3.Updat");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.print("Enter your select : ");
            int userSelect = in.nextInt();

            switch (userSelect) {
                case 1:
                    if (size < numbers.length) {
                        System.out.print("Enter number to add :");
                        int num = in.nextInt();
                        numbers[size] = num;
                        size++;
                    } else {
                        System.out.println("Array is full !!");
                    }
                    break;
                case 2:
                    System.out.println("Numbers of array :");
                    for (int i = 0; i < size; i++) {
                        System.out.println("number" + i + " = " + numbers[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of element :");
                    int index = in.nextInt();
                    if (index >= 0 && index < size) {
                        System.out.print("Enter the new value of element :");
                        int newValue = in.nextInt();
                        numbers[index] = newValue;
                        System.out.println("Update succssesfuly !");
                    } else {
                        System.out.println("Index Invalid !!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of element :");
                    int indexDelete = in.nextInt();
                    if (indexDelete >= 0 && indexDelete < size) {
                        for (int i = indexDelete; i < size; i++) {
                            numbers[i] = numbers[i + 1];
                            size--;
                            System.out.println("Delete succssesfuly !");

                        }
                    } else {
                        System.out.println("Index Invalid !!");
                    }
                    break;
                case 5:
                    UserSelect = false;
                    System.out.println("*** THANKS ***");

            }
        }
    }
}
