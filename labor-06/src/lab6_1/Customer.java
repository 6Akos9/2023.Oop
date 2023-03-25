package lab6_1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static int numCustomers;
    private final int id;
    private final String firstName;
    private String lastName;
    private final ArrayList<BankAccount> accounts = new ArrayList<>();

    public int getId() {
        return id;
    }

    public Customer(String firstName, String lastName, int accounts){
        numCustomers++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = numCustomers;
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

    public List<String> getAccountNumbers(){
        List<String> accountNumbers = new ArrayList<>();
        for (BankAccount account : accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    @Override
    public String toString() {
        return "Customer :" +
                "| id=" + id +
                "| firstName='" + firstName + '\'' +
                "| lastName='" + lastName + '\'' +
                "| numAccounts=" + accounts.size() +
                "| accounts=" + accounts +
                '|';
    }
}
