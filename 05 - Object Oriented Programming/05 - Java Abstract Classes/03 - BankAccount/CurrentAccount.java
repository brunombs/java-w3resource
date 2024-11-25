public class CurrentAccount extends BankAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance to withdraw " + amount + ". Current balance: $" + getBalance());
        }
        else{
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        }
    }
}
