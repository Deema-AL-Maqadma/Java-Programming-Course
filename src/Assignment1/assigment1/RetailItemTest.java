// Deema Mohammed AL-Maqadma
package assigment1;

public class RetailItemTest {

    public static void main(String[] args) {

        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);

        displayRetailItem(item1);
        displayRetailItem(item2);
        displayRetailItem(item3);
    }

    public static void displayRetailItem(RetailItem item) {
        System.out.println("Description: " + item.getDescription());
        System.out.println("Units On Hand: " + item.getUnitsOnHand());
        System.out.println("Price: $" + item.getPrice());
        System.out.println();
    }

}
