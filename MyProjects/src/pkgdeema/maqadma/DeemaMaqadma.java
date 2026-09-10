package pkg2023200766deemaal.maqadma;

import java.util.Scanner;

public class DeemaMaqadma {

    public static void main(String[] args) {

        Bag chest = new Bag(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n*** Welcome to the Treasure Chest Management System! ***");
            System.out.println("1. Add a new treasure");
            System.out.println("2. Remove a treasure");
            System.out.println("3. Display the contents of the chest");
            System.out.println("4. Count a specific treasure");
            System.out.println("5. Find the most frequent treasure");
            System.out.println("6. Exit");

            System.out.print("--> Choose an operation (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the treasure name to add: ");
                    String addTreasure = scanner.nextLine();
                    chest.addTreasure(addTreasure);
                    break;
                case 2:
                    System.out.print("Enter the treasure name to remove: ");
                    String removeTreasure = scanner.nextLine();
                    chest.removeTreasure(removeTreasure);
                    break;
                case 3:
                    chest.displayContents();
                    break;
                case 4:
                    System.out.print("Enter the treasure name to count: ");
                    String countTreasure = scanner.nextLine();
                    int count = chest.countTreasure(countTreasure);
                    System.out.println("--> There are " + count + " " + countTreasure + "(s) in the chest.");
                    break;
                case 5:
                    String mostFrequent = chest.mostFrequentTreasure();
                    System.out.println("--> The most frequent treasure is: " + mostFrequent);
                    break;
                case 6:
                    System.out.println("Exiting the program...\nThx, Goodbye ^_^");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! , please try again.");
            }
        }
    }

}
