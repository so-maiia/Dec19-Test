package AbstractPackage;

public class SavingsAccount extends Account{
    SavingsAccount(int accountNum, double balance, String name) {
        super(accountNum, balance, name);
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawing " + amount+ " from checking account");

    }

    @Override
    public void deposit(double amount) {
        System.out.println("Depositing " + amount +" in checking account");

    }
}
