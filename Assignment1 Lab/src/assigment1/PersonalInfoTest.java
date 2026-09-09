// Deema Mohammed AL-Maqadma
package assigment1;

public class PersonalInfoTest {

    public static void main(String[] args) {

        PersonalInfo myInfo = new PersonalInfo("Deema", "Gaza", 19, "000");
        PersonalInfo friendInfo1 = new PersonalInfo("Zain", "Gaza", 19, "111");
        PersonalInfo friendInfo2 = new PersonalInfo("Basmala", "Gaza", 19, "222");

        displayPersonalInfo(myInfo);
        displayPersonalInfo(friendInfo1);
        displayPersonalInfo(friendInfo2);
    }

    public static void displayPersonalInfo(PersonalInfo info) {
        System.out.println("Name: " + info.getName());
        System.out.println("Address: " + info.getAddress());
        System.out.println("Age: " + info.getAge());
        System.out.println("Phone Number: " + info.getPhoneNumber());
        System.out.println();
    }

}
