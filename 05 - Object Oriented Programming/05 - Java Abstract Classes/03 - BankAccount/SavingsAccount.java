public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + " successful. Current balance: $" + getBalance());
    }

    @Override
    void withdraw(double amount) {
        if(getBalance() < amount + 100) {
            System.out.println("Insufficient balance to withdraw " + amount + ". Current balance: $" + getBalance());
            System.out.println("You must have at least $100 on your account.");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + getBalance());
        }
    }
}
