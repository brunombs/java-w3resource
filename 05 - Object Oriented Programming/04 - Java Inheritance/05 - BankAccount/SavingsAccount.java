public class SavingsAccount extends BankAccountv2{
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    void withdraw(double amount) {
        if(getBalance() - amount < 100){
            System.out.println("Operation not allowed, minimum balance is 100");
        }
        else{
            super.withdraw(amount);
        }
    }
}
