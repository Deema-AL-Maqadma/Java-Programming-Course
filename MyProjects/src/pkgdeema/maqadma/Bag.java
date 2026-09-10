package pkg2023200766deemaal.maqadma;

import java.util.Random;

public class Bag {

    private Treasure[] treasures;
    private int size;
    Random random;

    public Bag(int capacity) {
        treasures = new Treasure[capacity];
        size = 0;
        random = new Random();
        distributeTreasures();
    }

    public void distributeTreasures() {
        String[] treasureTypes = {"Sword", "Shield", "Map", "Gold Coin"};
        int numberOfTreasures = random.nextInt(10) + 5;

        for (int i = 0; i < numberOfTreasures; i++) {
            String treasureName = treasureTypes[random.nextInt(treasureTypes.length)];
            addTreasure(treasureName);
        }
    }

    public void addTreasure(String name) {
        for (int i = 0; i < size; i++) {
            if (treasures[i].getName().equals(name)) {
                treasures[i].incrementCount();
                return;
            }
        }

        if (size < treasures.length) {
            treasures[size] = new Treasure(name);
            size++;
        } else {
            System.out.println("The bag is full, can't add more treasures.");
        }
    }

    public void removeTreasure(String name) {
        for (int i = 0; i < size; i++) {
            if (treasures[i].getName().equals(name)) {
                treasures[i].decrementCount();
                if (treasures[i].getCount() == 0) {

                    treasures[i] = treasures[size - 1];

                    size--;
                }
                return;
            }
        }
        System.out.println("Treasure not found.");
    }

    public int countTreasure(String name) {
        for (int i = 0; i < size; i++) {
            if (treasures[i].getName().equals(name)) {
                return treasures[i].getCount();
            }
        }
        return 0;
    }

    public boolean checkTreasure(String name) {
        for (int i = 0; i < size; i++) {
            if (treasures[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void displayContents() {
        if (size == 0) {
            System.out.println("The chest is empty.");
        } else {
            for (int i = 0; i < size; i++) {
                System.out.println(treasures[i]);
            }
        }
    }

    public String mostFrequentTreasure() {
        if (size == 0) {
            return "No treasures in the chest.";
        }
        Treasure mostFrequent = treasures[0];
        for (int i = 1; i < size; i++) {
            if (treasures[i].getCount() > mostFrequent.getCount()) {
                mostFrequent = treasures[i];
            }
        }
        return mostFrequent.getName();
    }
}
1