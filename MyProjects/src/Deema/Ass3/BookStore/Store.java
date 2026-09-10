/** My Name : Deema Mohammed AL-Maqadma
 * ID : 2023200766
 *   --->>> GO A HERO !!!
 * https://youtu.be/bSrPHfMgFzA?si=B0nAF-JrMFx9lpnd
Book Store
 */
package Deema.Ass3.BookStore;

public class Store { //Super class

    private int id;
    private String name;
    private String city;
    private int price;

    public Store() {
        this.id = 0;
        this.name = "Unknown";
        this.city = "Unknown";
        this.price = 0;
    }

    public Store(int id, String name, String city, int price) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n -----> The Store Details: \nID = " + id + "\n Name = " + name + "\nCity = " + city + "\nPrice = " + price;
    }

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */