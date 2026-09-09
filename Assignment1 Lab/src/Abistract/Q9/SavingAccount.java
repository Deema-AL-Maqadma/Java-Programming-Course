package Abistract.Q9;

public class SavingAccount extends BankAccount {

    private boolean statuse;

    public SavingAccount(double Balance, double Annual_intrset_rate) {
        super(Balance, Annual_intrset_rate);
        if (Balance >= 25) {
            statuse = true;
        } else {
            statuse = false;
        }
    }

    public void deposite(double amount) {
        super.deposite(amount);
        if (!statuse) {
            if (super.getBalance() >= 25) {
                statuse = true;
            }
        }

    }

    public void withdraw(double amount) {
        if (statuse) {
            super.withdraw(amount);
            if (super.getBalance() < 25) {
                statuse = false;
            }
        }
    }

    public void monthlyProcess() {
        int count = super.getNumber_withdrawals();
        if (count > 4) {
            super.setMonthly_service_Change(count - 4);//اول 4 مجانا
        }
        super.monthlyProcess();
        if (super.getBalance() < 25) {
            statuse = false;
        }
    }

}
