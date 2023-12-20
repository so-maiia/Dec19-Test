package bank_package;

public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.accountNumber = 123;
        bankAccount1.balance = -5000;
        bankAccount1.phoneNumber= "452454324225";
        bankAccount1.name= "Somaia";

        bankAccount1.deposit(500);

        bankAccount1.withdraw(30);
        System.out.println(bankAccount1.balance);

        //******************
        BankAccount2 bankAccount2 = new BankAccount2();

        bankAccount2.setAccountNumber(456);
        System.out.println(bankAccount2.getAccountNumber());

        bankAccount2.setBalance(200);

        System.out.println(bankAccount2.getBalance());

        bankAccount2.setPhoneNumber("3479084569");
        bankAccount2.withdraw(800);


    }
}
