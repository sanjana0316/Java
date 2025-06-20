public class BankAccount
{
    int accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) 
    {
        double newBalance = balance + amount;
        balance = newBalance;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 12345;
        acc.accountHolderName = "Ravi";
        acc.balance = 1000;
        acc.deposit(500);
    }
}
