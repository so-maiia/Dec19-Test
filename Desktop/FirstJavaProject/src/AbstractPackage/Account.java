package AbstractPackage;

public abstract class Account {
    private int accountNum;
    private double balance;
    private String name;

    // creating a constructor
    Account(int accountNum, double balance, String name){
        this.accountNum = accountNum;
        this.balance= balance;
        this.name= name;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // declare abstract method (whenever we create a class
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);
}
//implemented method means that it will have the curly braket {}