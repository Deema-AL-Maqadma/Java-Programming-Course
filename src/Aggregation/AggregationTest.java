package Aggregation;

public class AggregationTest {

    public static void main(String[] args) {
        TextBook MytextBook = new TextBook("BOOK", "Deema", "me");
        Instructor MyInstructor = new Instructor("AL-Maqadma", "Deema", "6");

        Course Mycourse = new Course("Programming", MytextBook, MyInstructor);
        System.out.println(Mycourse);
        System.out.println(MyInstructor);
        System.out.println(MytextBook);
    }
}
