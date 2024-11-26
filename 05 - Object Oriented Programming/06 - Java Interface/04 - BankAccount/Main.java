// Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(50);
        savingsAccount.deposit(25.39);
        savingsAccount.withdraw(10);
        savingsAccount.withdraw(50);
        System.out.println("Savings account balance: " + savingsAccount.getBalance());

        CurrentAccount currentAccount = new CurrentAccount(230.40);
        currentAccount.deposit(259.39);
        currentAccount.withdraw(150);
        currentAccount.withdraw(230);
        System.out.println("Current account balance: " + currentAccount.getBalance());
    }
}
