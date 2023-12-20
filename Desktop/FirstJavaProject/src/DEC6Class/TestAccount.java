package DEC6Class;

public class TestAccount {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(4586,6576,"ABCD",4500.36);
        savingsAccount.deposit(400);
        System.out.println(savingsAccount.getBalance());

        CheckingAccount checkingAccount = new CheckingAccount(45155,548221,"Chris",2330.65);
//        checkingAccount.withdraw(900);
//        checkingAccount.withdraw(500);
//        System.out.println(checkingAccount.getBalance());
        checkingAccount.withdraw(123);
    }
}
