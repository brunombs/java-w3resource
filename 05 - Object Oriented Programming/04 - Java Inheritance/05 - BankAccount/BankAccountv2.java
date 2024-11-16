public class BankAccountv2 {
    private String accountNumber;
    private double balance;

    public BankAccountv2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        if(balance >= amount) {
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
