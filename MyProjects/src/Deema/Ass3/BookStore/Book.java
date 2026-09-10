/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 * https://youtu.be/bSrPHfMgFzA?si=B0nAF-JrMFx9lpnd
Book Store
 */
package Deema.Ass3.BookStore;

public class Book extends Store { // Inheritance (is a)

    private int author;
    private int number_of_books;
    private int department;

    public Book() {
        super();
        this.author = 0;
        this.number_of_books = 0;
        this.department = 1;
    }

    public Book(int id, String name, String city, int price, int author, int number_of_books, int department) {
        super(id, name, city, price);
        this.author = author;
        this.number_of_books = number_of_books;
        this.department = department;
    }

    public int getAuthor() {
        return author;
    }

    public int getNumberOfBooks() {
        return number_of_books;
    }

    public int getDepartment() {
        return department;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public void setNumberOfBooks(int number_of_books) {
        this.number_of_books = number_of_books;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getPriceAfterDiscount() {
        if (department == 1) { //cultural
            return getPrice() - (getPrice() * 0.20);

        } else if (department == 2) { // social
            return getPrice() - (getPrice() * 0.08);
        }
        return 0;

    }

    @Override
    public String toString() {
        return super.toString() + "\n -----> The Book Details : \nAuthor = " + author + "\nNumber_of_books = " + number_of_books
                + "\nDepartment = " + (department == 1 ? "Cultural" : "Social")
                + "\n -----> The Price After Discount = " + getPriceAfterDiscount();
    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */