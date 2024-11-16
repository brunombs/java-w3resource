public class BankAccountv2 {
    private final String accountNumber;
    private double balance;

    public BankAccountv2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        System.out.println("Deposited " + amount + " to " + accountNumber);
        this.balance += amount;
    }

    void withdraw(double amount) {
        if(balance >= amount) {
            System.out.println("Withdrawn " + amount + " from " + accountNumber);
            this.balance -= amount;
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}
