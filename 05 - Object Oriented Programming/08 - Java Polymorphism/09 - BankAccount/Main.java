// Write a Java program to create a base class BankAccount with methods deposit() and withdraw(). Create two subclasses SavingsAccount and CheckingAccount. Override the withdraw() method in each subclass to impose different withdrawal limits and fees.

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500);
        System.out.println("Initial balance in account: $" + account.getBalance());

        account.depositAmount(50);
        System.out.println("After depositing $50, account balance: $" + account.getBalance());

        System.out.println("Attempting to withdraw $700 from account...");
        account.withdrawAmount(700);
        System.out.println("Balance after withdrawal attempt: $" + account.getBalance());

        account.depositAmount(100);
        System.out.println("After depositing $100, account balance: $" + account.getBalance());

        System.out.println("Attempting to withdraw $200 from account...");
        account.withdrawAmount(200);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        SavingsAccount saving = new SavingsAccount(50, 100);
        System.out.println("\nInitial balance in savings account: $" + saving.getBalance());

        saving.depositAmount(50);
        System.out.println("After depositing $50, savings account balance: $" + saving.getBalance());

        saving.withdrawAmount(10);
        System.out.println("After withdrawing $10, savings account balance: $" + saving.getBalance());

        System.out.println("Attempting to withdraw $120 from savings account...");
        saving.withdrawAmount(120);
        System.out.println("Balance after withdrawal attempt: $" + saving.getBalance());

        saving.depositAmount(200);
        System.out.println("After depositing $200, savings account balance: $" + saving.getBalance());

        saving.withdrawAmount(50);
        System.out.println("After withdrawing $50, savings account balance: $" + saving.getBalance());

        saving.withdrawAmount(200);
        System.out.println("Attempting to withdraw $200 from savings account...");
        System.out.println("Balance after withdrawal attempt: $" + saving.getBalance());

        CheckingAccount checking = new CheckingAccount(50, 100);
        System.out.println("\nInitial balance in checking account: $" + checking.getBalance());

        checking.depositAmount(100);
        System.out.println("After depositing $100, checking account balance: $" + checking.getBalance());

        checking.withdrawAmount(30);
        System.out.println("After withdrawing $30, checking account balance: $" + checking.getBalance());

        System.out.println("Attempting to withdraw $200 from checking account...");
        checking.withdrawAmount(200);
        System.out.println("Balance after withdrawal attempt: $" + checking.getBalance());

        checking.depositAmount(300);
        System.out.println("After depositing $300, checking account balance: $" + checking.getBalance());

        checking.withdrawAmount(150);
        System.out.println("After withdrawing $150, checking account balance: $" + checking.getBalance());

        checking.withdrawAmount(100);
        System.out.println("After withdrawing $100, checking account balance: $" + checking.getBalance());

        System.out.println("Attempting to withdraw $500 from checking account...");
        checking.withdrawAmount(500);
        System.out.println("Balance after withdrawal attempt: $" + checking.getBalance());
    }
}
