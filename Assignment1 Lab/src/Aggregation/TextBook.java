package Aggregation;

public class TextBook {

    private String title;
    private String auther;
    private String publisher;

    public TextBook(String t, String a, String p) {
        title = t;
        auther = a;
        publisher = p;
    }

    public TextBook(TextBook obj) { // object لنسخ
        title = obj.title;
        auther = obj.auther;
        publisher = obj.publisher;
    }

    public void set(String t, String a, String p) {
        title = t;
        auther = a;
        publisher = p;
    }

    public String toString() {
        String str = "\nTitle = " + title
                + "\nAuther = " + auther
                + "\nPublisher = " + publisher;
        return str;
    }

}
