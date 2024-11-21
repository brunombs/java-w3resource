public class CheckingAccount extends BankAccount {
    private final double overdraftFee;

    public CheckingAccount(double balance, double overdraftFee) {
        super(balance);
        this.overdraftFee = overdraftFee;
    }

    @Override
    public void withdrawAmount(double amount) {
        if (amount <= getBalance()) {
            super.withdrawAmount(amount);
        }
        else {
            System.out.println("Overdraft fee applied.");
            super.withdrawAmount(amount + overdraftFee);
        }
    }
}
