public class CurrentAccount implements Account {
    private double balance;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $ " + amount + " successful! Current balance: $ " + this.balance);
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal of $ " + amount + " successful! Remaining balance: $ " + this.balance);
        } else {
            System.out.println("Insufficient balance to withdraw $ " + amount + ". Current balance: $ " + this.balance);
        }
    }
}
