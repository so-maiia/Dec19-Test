package bank_package;

public class BankAccount {
    int accountNumber;
    String name;
    String phoneNumber;
    String address;
    double balance;

    public void withdraw(double amount){
        balance = balance - amount;

    }
    public void deposit(double amount){
        balance = balance + amount;
    }

}
