// Deema Mohammed AL-Maqadma
package assigment1;

public class PersonalInfo {

    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    public PersonalInfo(String n, String ad, int a, String ph) {
        name = n;
        address = ad;
        age = a;
        phoneNumber = ph;
    }

    public PersonalInfo() {
        name = "";
        address = "";
        age = 0;
        phoneNumber = "";
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String ad) {
        address = ad;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setPhoneNumber(String ph) {
        phoneNumber = ph;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
