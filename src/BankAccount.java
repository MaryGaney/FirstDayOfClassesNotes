public class BankAccount {

    private int accountNo;

    private double balance;

    private static int lastAccountNo = 1000;

    public BankAccount(int accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public BankAccount(double balance){
        this.accountNo = lastAccountNo++;
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }
}
