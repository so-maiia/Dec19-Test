package DEC6Class;

public class CheckingAccount extends Account {
    CheckingAccount(int accountNumber, int SSN, String name, double v) {
        super(accountNumber, SSN, name);
    }

    // method overloading
    public void withdraw(double amount) {
        System.out.println("you are inside checking account withdraw method");
    }

    public void withdraw(double amount, String str) {
        System.out.println("you are inside checking account withdraw method");
    }
// polymorphism- creating the object with the reference of a parent
    Account account = new Account(555,66,"Bob");
    Account account1= new SavingsAccount(456,231,"Clancey",451.32);
//encapsulation
    // data hiding (hiding the data using private access modifier)

}
