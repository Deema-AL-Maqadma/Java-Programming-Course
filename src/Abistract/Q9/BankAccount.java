package Abistract.Q9;

public abstract class BankAccount {

    private double Balance, Annual_intrset_rate, Monthly_service_Change;
    private int Number_of_deposite, Number_withdrawals;

    public BankAccount(double Balance, double Annual_intrset_rate) {
        this.Balance = Balance;
        this.Annual_intrset_rate = Annual_intrset_rate;
    }

    public void deposite(double amount) {
        Balance += amount;
        Number_of_deposite++;
    }

    public void withdraw(double amount) {
        Balance -= amount;
        Number_withdrawals++;
    }

    public void calcInterset() {
        double Monthly_intrset_rate = Annual_intrset_rate / 12;
        double Monthly_intrset = Balance * Monthly_intrset_rate;
        Balance += Monthly_intrset;
    }

    public void monthlyProcess() {
        Balance -= Monthly_service_Change;
        calcInterset();
        Number_of_deposite = 0;
        Number_withdrawals = 0;
        Monthly_service_Change = 0;
    }

    public double getBalance() {
        return Balance;
    }

    public double getAnnual_intrset_rate() {
        return Annual_intrset_rate;
    }

    public int getNumber_of_deposite() {
        return Number_of_deposite;
    }

    public int getNumber_withdrawals() {
        return Number_withdrawals;
    }

    public void setMonthly_service_Change(double Monthly_service_Change) {
        this.Monthly_service_Change = Monthly_service_Change;
    }

}
