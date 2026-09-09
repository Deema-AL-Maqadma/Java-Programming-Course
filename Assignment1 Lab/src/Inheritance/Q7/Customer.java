
package Inheritance.Q7;

public class Customer  extends Person {  //Inheretance
    private String customer_number;
    private boolean mailing_list;

    public Customer() {
                System.out.println("Sub Class -Customer- ");

    }

    public Customer(String customer_number, boolean mailing_list, String name, String address, String telephone) {
        super(name, address, telephone);// تكون اول جملة وتنفذ ما بداخل السوبر
        this.customer_number = customer_number;
        this.mailing_list = mailing_list;
    }
    

    public String getCustomer_number() {
        return customer_number;
    }

    public void setCustomer_number(String customer_number) {
        this.customer_number = customer_number;
    }

    public boolean isMailing_list() {
        return mailing_list;
    }

    public void setMailing_list(boolean mailing_list) {
        this.mailing_list = mailing_list;
    }

    @Override
    public String toString() {
        return super.toString()// استدعاء لميثود السوبر حتى ينفذ عند طباعة اوبجكت من السب
                +"\nCustomer{" + "customer_number=" + customer_number + ", mailing_list=" + mailing_list + '}';
    }
    
    
    
}
