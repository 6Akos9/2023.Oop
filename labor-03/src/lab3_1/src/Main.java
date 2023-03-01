public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        //System.out.println(customer1);
        BankAccount account1 = new BankAccount("OTP00001");
        customer1.setAccount(account1);

        System.out.println(customer1);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.deposit(1000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.withdraw(285);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());

        System.out.println("\n");

        Customer customer2 = new Customer("Mary", "WHITE");
        BankAccount account2 = new BankAccount("OTP00002");
        customer2.setAccount(account2);

        System.out.println(customer2);
        System.out.println(account1.getAccountNumber()+": "+account2.getBalance());
        account2.deposit(589);
        System.out.println(account1.getAccountNumber()+": "+account2.getBalance());
        account2.withdraw(130);
        System.out.println(account1.getAccountNumber()+": "+account2.getBalance());
        customer2.closeAccount();
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}