/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
package MedicalClinicManagementSystem;

public class Person implements serializable { //Supper Class

    private String name, id, address, phoneNumber, email, gender;

    public Person() {
    }

    public Person(String name, String id, String address, String phoneNumber, String email, String gender) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "--->> Person : \n"
                + "Name=" + name
                + "\nId=" + id
                + "\nAddress=" + address
                + "\nPhoneNumber=" + phoneNumber
                + "\nEmail=" + email
                + "\nGender=" + gender;

    }
}
/**
 * My Name : Deema Mohammed AL-Maqadma ID : 2023200766
 */
