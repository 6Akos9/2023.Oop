import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private final ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName, int accounts){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public void addAccount(BankAccount account){
        if (accounts.size() < 10){
            accounts.add(account);
        }
        else{
            System.out.println("Maximum number of accounts reached!");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }

    public void closeAccount(String accountNumber){
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)){
                accounts.remove(account);
                return;
            }
        }
        System.out.println("Account not found");
    }

    @Override
    public String toString() {
        return "Customer " +
                "| firstName='" + firstName + '\'' +
                "| lastName='" + lastName + '\'' +
                "| numAccounts=" + accounts.size() +
                "| accounts=" + accounts +
                '|';
    }
}
