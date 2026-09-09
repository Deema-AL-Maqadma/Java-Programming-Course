package datastructure.CH2;

import java.util.Scanner;

public class TowDimemsionalArray {

    public static void main(String[] args) {
        String[][] students = new String[3][2];
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
                    if (size < students.length) {
                        System.out.print("Enter student name :");
                        String stdName = in.next();
                        System.out.print("Enter student grade :");
                        String stdGrade = in.next();
                        students[size][0] = stdName;
                        students[size][1] = stdGrade;
                        size++;
                        System.out.println("* Student add successfuly *");
                    } else {
                        System.out.println("Array is full !!");
                    }
                    break;
                case 2:
                    System.out.println("* All students in array *");
                    for (int i = 0; i < size; i++) {
                        System.out.println("Student Name" + i + " = " + students[i][0]);
                        System.out.println("Student Grade" + i + " = " + students[i][1]);
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of student :");
                    int index = in.nextInt();
                    if (index >= 0 && index < size) {
                        System.out.print("Enter the new name of student :");
                        String newName = in.next();
                        System.out.print("Enter the new grade of student :");
                        String newGrade = in.next();
                        students[index][0] = newName;
                        students[index][1] = newGrade;
                        System.out.println("Update succssesfuly !");
                    } else {
                        System.out.println("Index Invalid !!");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of student :");
                    int indexDelete = in.nextInt();
                    if (indexDelete >= 0 && indexDelete < size) {
                        for (int i = indexDelete; i < size; i++) {
                            students[i][0] = students[i + 1][0];
                            students[i][1] = students[i + 1][1];
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
