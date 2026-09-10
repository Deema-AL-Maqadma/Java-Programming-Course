/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
package MedicalClinicManagementSystem;

import java.util.Date;

public class Doctor extends Employee implements serializable {

    private int completedBookings, department;

    public Doctor() {
    }

    public Doctor(Doctor object) {  //copy constructor
        super(object.getBasicSalary(), object.getLiveExpensive(), object.getHireDate(), object.getName(), object.getId(), object.getAddress(), object.getPhoneNumber(), object.getEmail(), object.getGender());
        this.completedBookings = object.completedBookings;
        this.department = object.department;
    }

    public Doctor(int completedBookings, int department, double basicSalary, double liveExpensive, Date hireDate, String name, String id, String address, String phoneNumber, String email, String gender) {
        super(basicSalary, liveExpensive, hireDate, name, id, address, phoneNumber, email, gender);
        this.completedBookings = completedBookings;
        this.department = department;
    }

    public int getCompletedBookings() {
        return completedBookings;
    }

    public void setCompletedBookings(int completedBookings) {
        this.completedBookings = completedBookings;
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

    @Override
    public String toString() {
        return "--->> Doctor : \n"
                + "\nCompletedBookings=" + completedBookings
                + "\nDepartment=" + department;
    }

    @Override
    public double getSalary() { //Override for Abstract method
        return getBasicSalary() + getLiveExpensive() + (2 * completedBookings);
    }

}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
