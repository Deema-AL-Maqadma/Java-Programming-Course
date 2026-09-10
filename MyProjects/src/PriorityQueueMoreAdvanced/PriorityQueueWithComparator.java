/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!
*/
package PriorityQueueMoreAdvanced;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueWithComparator {

    public static void main(String[] args) {
        Comparator<Item> priorityComparator = new Comparator<Item>() {

            @Override
            public int compare(Item item1, Item item2) {
                if (item1.priority != item2.priority) {
                    return item2.priority - item1.priority;
                }
                return item1.name.compareTo(item2.name);
            }
        };

        PriorityQueue<Item> x = new PriorityQueue<>(priorityComparator);
        x.add(new Item("Red", 10));
        x.add(new Item("Blue", 5));
        x.add(new Item("Black", 10));
        x.add(new Item("Pink", 8));
        System.out.println("----->> Items in Priority Order <<-----");
        while (!x.isEmpty()) {
            System.out.println(x.poll());

        }

    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */