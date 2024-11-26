public class SavingsAccount implements Account {
    double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposit of $ " + amount + " successful! Current balance: $ " + this.balance);
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance - amount < 30) {
            System.out.println("Withdrawal denied: You must maintain at least $30 in your account after the withdrawal of $" + amount);
        } else if (amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal of $ " + amount + " successful! Remaining balance: $ " + this.balance);
        } else {
            System.out.println("Insufficient balance to withdraw $ " + amount + ". Current balance: $ " + this.balance);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
