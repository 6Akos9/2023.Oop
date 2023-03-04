public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("OTP00001");
        System.out.println(account);
        System.out.println(account.getAccountNumber()+": "+account.getBalance());
        account.deposit(1000);
        System.out.println(account.getAccountNumber()+": "+account.getBalance());
        boolean result = account.withdraw(500);
        if ( !result ){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account.getAccountNumber()+": "+account.getBalance());
        boolean result1 = account.withdraw(1000);
        if ( !result1 ){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account.getAccountNumber()+": "+account.getBalance());
        BankAccount account1 = new BankAccount("OTP00002");
        System.out.println("*****************");
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        account1.deposit(2000);
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
        boolean result2 = account1.withdraw(1);
        if ( !result2 ){
            System.out.println("You do not have sufficient funds for this operation!");
        }
        System.out.println(account1.getAccountNumber()+": "+account1.getBalance());
    }
}