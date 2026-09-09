package Aggregation;

public class Course {

    private String coursName;
    private TextBook textBook; //متغير مرجعي من كلاس اخر 
    private Instructor instructor;//متغير مرجعي من كلاس اخر 

    public Course(String n, TextBook text, Instructor instr) {
        coursName = n;
        textBook = new TextBook(text);// انشاء object
        instructor = new Instructor(instr);// انشاء object
    }

    public String getCoursName() {
        return coursName;
    }

    public TextBook getTextBook() {
        return new TextBook(textBook);
    }

    public Instructor getInstructor() {
        return new Instructor(instructor);
    }

    public String toString() {
        String str = "coursName : " + coursName
                + "\nTextBook : " + textBook
                + "\nInstructor : " + instructor;
        return str;
    }
}
