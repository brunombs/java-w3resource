// Write a Java program to create a class called "BankAccount" with instance variables 'accountNumber' and balance, and static variables 'bankName' and 'interestRate'. Provide static methods to get and set the static variables. Create several 'BankAccount' objects and print their details along with the static variables.

public class BankAccount {
    private final String accountNumber;
    private final double balance;
    private static String bankName;
    private static double interestRate;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setBankName(String bankName) {
        BankAccount.bankName = bankName;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public void printDetails(){
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Bank name: " + bankName);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 100);
        BankAccount.setBankName("Itau");
        BankAccount.setInterestRate(0.5);
        bankAccount.printDetails();
    }
}
