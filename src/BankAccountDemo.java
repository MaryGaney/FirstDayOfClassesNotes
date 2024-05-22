public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000,1000);
        BankAccount account2 = new BankAccount(2000,10000);
        BankAccount account3 = new BankAccount(3000,100000);

        System.out.println(account1.getAccountNo() + account1.getBalance());
        System.out.println(account2.getAccountNo() + account2.getBalance());
        System.out.println(account3.getAccountNo() + account3.getBalance());


        BankAccount account4 = new BankAccount(1000);
        BankAccount account5 = new BankAccount(10000);
        BankAccount account6 = new BankAccount(100000);

        System.out.println(account4.getAccountNo() + account4.getBalance());
        System.out.println(account5.getAccountNo() + account5.getBalance());
        System.out.println(account6.getAccountNo() + account6.getBalance());


    }
}
