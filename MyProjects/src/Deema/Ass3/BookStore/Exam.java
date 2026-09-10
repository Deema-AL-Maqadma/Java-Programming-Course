/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 * https://youtu.be/bSrPHfMgFzA?si=B0nAF-JrMFx9lpnd
Book Store رابط فيديو الشرح يوتيوب
 */
package Deema.Ass3.BookStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        ArrayList<Book> MyBooks = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println(" -----> Welcome to the Book Store <-----\n Here We Go ! ");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Edit Book");
            System.out.println("4. Print all books greater than 200 in number_of_books");
            System.out.println("5. Exit");
            System.out.print("Enter the number of your Choice : ");

            int choice = k.nextInt();
            k.nextLine();  // consume the newline character

            switch (choice) {
                case 1:
                    // Add Book
                    System.out.print("->> Enter Book ID : ");
                    int id = k.nextInt();
                    k.nextLine(); 
                    System.out.print("Enter Book Name : ");
                    String name = k.nextLine();
                    System.out.print("Enter Book City : ");
                    String city = k.nextLine();
                    System.out.print("Enter Book Price : ");
                    int price = k.nextInt();
                    System.out.print("Enter Author ID : ");
                    int author = k.nextInt();
                    System.out.print("Enter Number of Books:");
                    int numberOfBooks = k.nextInt();
                    System.out.print("Enter Department [1 - Cultural, 2 - Social] (*Enter int value) : ");
                    int department = k.nextInt();

                    MyBooks.add(new Book(id, name, city, price, author, numberOfBooks, department));
                    System.out.println("\nBook added successfully!");
                    break;

                case 2:
                    // Search Book
                    System.out.print("Enter book ID to search : ");
                    int searchId = k.nextInt();
                    boolean found = false;
                    for (Book book : MyBooks) {
                        if (book.getId() == searchId) {
                            System.out.println("Book found : " + book);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Book Not found ...");
                    }
                    break;

                case 3:
                    // Edit Book
                    System.out.print("Enter book ID to edit : ");
                    int editId = k.nextInt();
                    boolean edited = false;
                    for (Book book : MyBooks) {
                        if (book.getId() == editId) {
                            k.nextLine(); 
                            System.out.print("Enter new book name : ");
                            book.setName(k.nextLine());
                            System.out.print("Enter new book city : ");
                            book.setCity(k.nextLine());
                            System.out.print("Enter new book price : ");
                            book.setPrice(k.nextInt());
                            System.out.print("Enter new author ID : ");
                            book.setAuthor(k.nextInt());
                            System.out.print("Enter new number of books : ");
                            book.setNumberOfBooks(k.nextInt());
                            System.out.print("Enter new department (1 - Cultural, 2 - Social) : ");
                            book.setDepartment(k.nextInt());
                            edited = true;
                            System.out.println("\nBook edited successfully!");
                            break;
                        }
                    }
                    if (!edited) {
                        System.out.println("Book not found ...");
                    }
                    break;

                case 4:
                    // Print books with number of books greater than 200
                    System.out.println("Books with more than 200 books:");
                    for (Book book : MyBooks) {
                        if (book.getNumberOfBooks() > 200) {
                            System.out.println(book);
                        }
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    System.out.println("Thx ^_^");

                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        k.close();
    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
