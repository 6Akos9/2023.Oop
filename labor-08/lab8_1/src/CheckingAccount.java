public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit() {
        return overdraftLimit;
    }
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
    public boolean withdraw(double amount){
        if (balance + overdraftLimit < amount){
            return false;
        }
        balance -= amount;
        return true;
    }
    @Override
    public String toString() {
        return "CheckingAccount:" +
                "|overdraftLimit=" + overdraftLimit +
                '|';
    }
}
