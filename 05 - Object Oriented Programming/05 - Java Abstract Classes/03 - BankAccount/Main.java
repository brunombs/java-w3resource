// Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.

public class Main {
    public static void main(String[] args) {
        SavingsAccount saving = new SavingsAccount(100);
        System.out.println("-----SAVING ACCOUNTS-----");
        saving.deposit(100);
        saving.withdraw(50);
        saving.withdraw(250);
        saving.withdraw(100);

        CurrentAccount currentAccount = new CurrentAccount(100);
        System.out.println("\n-----CURRENT ACCOUNT-----");
        currentAccount.deposit(120);
        currentAccount.withdraw(50);
        currentAccount.withdraw(250);
        currentAccount.withdraw(100);
    }
}
