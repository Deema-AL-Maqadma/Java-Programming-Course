package First;

public class RectangleTest {

    public static void main(String[] args) {
        Rectangle box = new Rectangle();
        box.setLength(8.5);
        box.setWidth(4.5);

        System.out.println("The Length  = " + box.getLength());
        System.out.println("The Width= " + box.getWidth());
        System.out.println("The Area = " + box.getArea());
    }
}
