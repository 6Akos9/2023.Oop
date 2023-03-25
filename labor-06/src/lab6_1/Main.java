package lab6_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();

        for (int i = 0; i < 150; i++) {
            accounts.add(new BankAccount());
        }

        for (BankAccount account : accounts){
            System.out.println(account);
        }
        ArrayList<Customer> customers = new ArrayList<>();

        Customer customer1 = new Customer("John", "Doe", 1);
        customer1.addAccount(new BankAccount());
        customers.add(customer1);

        Customer customer2 = new Customer("Jane", "Smith", 2);
        customer2.addAccount(new BankAccount());
        customers.add(customer2);

        Customer customer3 = new Customer("Bob", "Johnson", 1);
        customer3.addAccount(new BankAccount());
        customers.add(customer3);

        for (Customer customer : customers) {
            System.out.println(customer);
        }

        Bank bank = new Bank("OTP", customers);

    }
}
