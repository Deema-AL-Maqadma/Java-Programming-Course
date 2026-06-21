package Aggregation;

public class Instructor {

    private String lastName;
    private String firstName;
    private String officeName;

    public Instructor(String l, String f, String o) {
        lastName = l;
        firstName = f;
        officeName = o;
    }

    public Instructor(Instructor obj2) {
        lastName = obj2.lastName;
        firstName = obj2.firstName;
        officeName = obj2.officeName;
    }

    public void set(String l, String f, String o) {
        lastName = l;
        firstName = f;
        officeName = o;
    }

    public String toString() {
        return "\nfirstName=" + firstName
                + "\nlastName=" + lastName
                + "\nofficeName=" + officeName;
    }

}
