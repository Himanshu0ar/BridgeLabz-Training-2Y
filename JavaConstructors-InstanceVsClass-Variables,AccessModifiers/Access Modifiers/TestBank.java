class BankAccount {
    private String accountHolder;
    protected String accountType;
    double balance;
    public int accountNumber;

    public BankAccount(String accountHolder, String accountType, double balance, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolder, String accountType, double balance, int accountNumber) {
        super(accountHolder, accountType, balance, accountNumber);
    }

    public void showDetails() {
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class TestBank {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Ravi", "Savings", 5000, 101);
        acc.showDetails();
    }
}
