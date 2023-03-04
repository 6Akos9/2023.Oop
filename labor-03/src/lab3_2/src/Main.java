
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Akos", "BALAZS");
        Customer customer2 = new Customer("Matyas", "CSIKI");

        BankAccount account1 = new BankAccount("OTP00001");
        BankAccount account2 = new BankAccount("OTP00002");
        BankAccount account3 = new BankAccount("OTP00003");
        BankAccount account4 = new BankAccount("OTP00004");
        BankAccount account5 = new BankAccount("OTP00005");
        customer1.addAccount(account1);
        customer1.addAccount(account2);
        customer1.addAccount(account3);
        customer1.addAccount(account4);
        customer1.addAccount(account5);

        BankAccount account6 = new BankAccount("OTP00006");
        BankAccount account7 = new BankAccount("OTP00007");
        BankAccount account8 = new BankAccount("OTP00008");
        BankAccount account9 = new BankAccount("OTP00009");
        BankAccount account10 = new BankAccount("OTP00010");
        BankAccount account11 = new BankAccount("OTP00011");
        BankAccount account12 = new BankAccount("OTP00012");
        BankAccount account13 = new BankAccount("OTP00013");
        BankAccount account14 = new BankAccount("OTP00014");
        customer2.addAccount(account6);
        customer2.addAccount(account7);
        customer2.addAccount(account8);
        customer2.addAccount(account9);
        customer2.addAccount(account10);
        customer2.addAccount(account11);
        customer2.addAccount(account12);
        customer2.addAccount(account13);
        customer2.addAccount(account14);

        System.out.println(customer1);
        System.out.println(customer2);

        account1.deposit(3672);
        account2.deposit(321);
        account3.deposit(2330);
        account4.deposit(829);
        account5.deposit(567);
        account6.deposit(3672);
        account7.deposit(321);
        account8.deposit(2330);
        account9.deposit(829);
        account10.deposit(567);
        account11.deposit(321);
        account12.deposit(2330);
        account13.deposit(829);
        account14.deposit(567);

        System.out.println("After deposits: \n");
        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP00014");

        System.out.println("After closing the accounts: \n");
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
