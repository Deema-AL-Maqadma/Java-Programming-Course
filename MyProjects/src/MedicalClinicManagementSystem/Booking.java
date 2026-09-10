/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
package MedicalClinicManagementSystem;

import java.util.Date;

public class Booking implements serializable {

    private String bookingId, details;
    private int department;
    private Date bookingDate;
    private Doctor doctor; // Aggregaton (Doctor object)
    private Patient patient; // Aggregaton (Patient object)

    public Booking(String bookingId, String details, int department, Date bookingDate, Doctor doctor, Patient patient) {
        this.bookingId = bookingId;
        this.details = details;
        this.department = department;
        this.bookingDate = bookingDate;
        this.doctor = doctor;
        this.patient = patient;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) { //must be a valid value 1,2,3
        if (department >= 1 && department <= 3) {
            this.department = department;
        } else {
            throw new IllegalArgumentException("Invalid department value !!!");
        }
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "--->> Booking : \n"
                + "\nBookingId=" + bookingId
                + "\nDetails=" + details
                + "\nDepartment=" + department
                + "\nBookingDate=" + bookingDate
                + "\nDoctor=" + doctor
                + "\nPatient=" + patient;
    }

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
