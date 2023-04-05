public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Kis", "Pista", 2);
        Customer customer2 = new Customer("Paprika", "Jancsi", 2);
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        System.out.println(customer1);
        System.out.println(customer2);
    }
}