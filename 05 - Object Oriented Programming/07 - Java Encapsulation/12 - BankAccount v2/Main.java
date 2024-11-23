// Write a Java program to create a class called Account with private instance variables accountNumber, accountHolder, and balance. Provide public getter and setter methods to access and modify these variables. Add a method called deposit() that takes an amount and increases the balance by that amount, and a method called withdraw() that takes an amount and decreases the balance by that amount.

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.setAccountHolderName("Bruno");
        account1.setAccountNumber(130);
        account1.setBalance(0);
        System.out.println("Account holder name: " + account1.getAccountHolderName());
        System.out.println("Account number: " + account1.getAccountNumber());
        System.out.println("Balance: " + account1.getBalance());
        account1.deposit(500);
        System.out.println("Balance after deposit: " + account1.getBalance());
        account1.withdraw(300);
        System.out.println("Balance after withdraw: " + account1.getBalance());
        account1.withdraw(300);
    }
}
