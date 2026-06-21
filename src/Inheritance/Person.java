package Inheritance;

public class Person {

    private String name;// بقدر اوصل لهم من خلال الميثود الخاصة بالكلاس فقط
    private long id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

}
