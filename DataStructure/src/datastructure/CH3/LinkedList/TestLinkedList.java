package datastructure.CH3.LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList<String> Names = new SinglyLinkedList<>();
        Names.InsertAtBeginning("Deema");
        Names.InsertAtEnd(" AL-Maqadma");
        int z = Names.Size();
        System.out.println(z);
        Names.Display();

        System.out.println();
    }

}
