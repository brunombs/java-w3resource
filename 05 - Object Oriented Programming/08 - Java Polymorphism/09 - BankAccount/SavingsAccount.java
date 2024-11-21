public class SavingsAccount extends BankAccount {
    private final double withdrawLimit;

    public SavingsAccount(double balance, double withdrawLimit) {
        super(balance);
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public void withdrawAmount(double amount) {
        if (amount > withdrawLimit) {
            System.out.println("Withdrawal limit exceeded");
        }
        else {
            super.withdrawAmount(amount);
        }
    }
}
