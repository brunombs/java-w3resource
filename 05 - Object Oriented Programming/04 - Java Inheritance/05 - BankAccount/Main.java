// Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.

public class Main {
    public static void main(String[] args) {
        BankAccountv2 acc1 = new BankAccountv2("John Doe", 500.00);
        acc1.deposit(500.25);
        System.out.println("Balance: " + acc1.getBalance());
        acc1.withdraw(800.40);
        System.out.println("Balance: " + acc1.getBalance());
        acc1.withdraw(200.00);
        System.out.println("Balance: " + acc1.getBalance());
        SavingsAccount sav1 = new SavingsAccount("John Doe", 500.00);
        sav1.deposit(500.25);
        System.out.println("Balance: " + sav1.getBalance());
        sav1.withdraw(950);
        sav1.withdraw(850);
        sav1.deposit(350);

    }
}
