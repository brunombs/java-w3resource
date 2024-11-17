// Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance. Provide public getter and setter methods to access and modify these variables.

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500, 12);
        BankAccount account2 = new BankAccount(1500, 14);

        System.out.println("Account 1 number: " + account1.getAccountNumber());
        System.out.println("Account 1 balance: " + account1.getBalance());
        System.out.println("Account 2 number: " + account2.getAccountNumber());
        System.out.println("Account 2 balance: " + account2.getBalance());

    }
}
