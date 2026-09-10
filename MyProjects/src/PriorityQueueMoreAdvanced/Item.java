/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!
*/
package PriorityQueueMoreAdvanced;

public class Item {

    String name;
    int priority;

    public Item(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Item -> " + "Name = " + name + ", Priority = " + priority;
    }

}
