package datastructure.CH3;

public class BagTest {

    public static void main(String[] args) {
        Bag<String> name = new Bag<>(5);
        boolean bagFull = name.IsFull();
        System.out.println("BagFull :" + bagFull);

        boolean bagEmpty = name.IsEmpty();
        System.out.println("BagEmpty :" + bagEmpty);
        System.out.println(" size = " + name.Size());

    }

}
