package AbstractPackage;

public class TestAccount {
    public static void main(String[] args) {
        Account cAccount = new CheckingAccount(123, 500, "ABC");
        Account sAccount = new SavingsAccount(345,5345,"SFSD");
        //abstractly present-> only account doesn't exist (checking and savings)r

        cAccount.deposit(423);
        sAccount.withdraw(46);


    }
}
