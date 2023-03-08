import java.util.Arrays;
import java.util.ArrayList;

public class Customer {
    private final String firstName;
    private String lastName;
    private int numAccounts;
    public static final int MAX_ACCOUNTS = 10;
    private final ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.numAccounts = 0;
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

    public int getNumAccounts() {
        return numAccounts;
    }

    public void addAccount(BankAccount account){
        if (numAccounts < MAX_ACCOUNTS){
            accounts.set(numAccounts++, account);
        }
        else{
            System.out.println("Maxmimum number of accounts reached!");
        }
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)){
                return accounts.get(i);
            }
        }
        return null;
    }
    public void closeAccount(String accountNumber){
        for (int i = 0; i < numAccounts; i++) {
            if (accounts.get(i).getAccountNumber().equals(accountNumber)){
                for (int j = 0; j < numAccounts - 1; j++) {
                    accounts.set(j, accounts.get(j + 1));
                }
                accounts.set(--numAccounts, null);
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
                "| numAccounts=" + numAccounts +
                "| accounts=" + Arrays.toString(new ArrayList[]{accounts}) +
                '|';
    }
}
