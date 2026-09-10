/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
package MedicalClinicManagementSystem;

public class Patient extends Person implements serializable {

    private int bookingOrder;

    public Patient() {
    }

    public Patient(Patient object) { //copy constructor
        super(object.getName(), object.getId(), object.getAddress(), object.getPhoneNumber(), object.getEmail(), object.getGender());
        this.bookingOrder = object.bookingOrder;
    }

    public Patient(int bookingOrder, String name, String id, String address, String phoneNumber, String email, String gender) {
        super(name, id, address, phoneNumber, email, gender);
        this.bookingOrder = bookingOrder;
    }

    public int getBookingOrder() {
        return bookingOrder;
    }

    public void setBookingOrder(int bookingOrder) {
        this.bookingOrder = bookingOrder;
    }

    public void increaseBooking() {
        bookingOrder++;
    }

    public void decreaseBooking() {
        if (bookingOrder > 0) {
            bookingOrder--;
        }
    }

    @Override
    public String toString() {
        return "--->> Patient : \n"
                + "\nBookingOrder=" + bookingOrder;
    }

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
