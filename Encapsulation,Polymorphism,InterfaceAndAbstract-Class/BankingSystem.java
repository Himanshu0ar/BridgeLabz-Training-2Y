import java.util.*;

// Abstract Class
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.holderName = holder;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { 
        if (balance >= amt) balance -= amt; 
        else System.out.println("Insufficient balance!");
    }

    public abstract double calculateInterest();
}

// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int acc, String h, double b) { super(acc, h, b); }

    public double calculateInterest() { return getBalance() * 0.04; } // 4%
    public void applyForLoan(double amount) { System.out.println("Loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 5000; }
}

// Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int acc, String h, double b) { super(acc, h, b); }

    public double calculateInterest() { return getBalance() * 0.02; } // 2%
    public void applyForLoan(double amount) { System.out.println("Loan applied: " + amount); }
    public boolean calculateLoanEligibility() { return getBalance() > 20000; }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        System.out.print("Enter number of accounts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Account " + (i + 1));
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Holder Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Initial Balance: ");
            double bal = sc.nextDouble();
            sc.nextLine();

            System.out.print("Enter Account Type (1=Savings, 2=Current): ");
            int type = sc.nextInt();
            sc.nextLine();

            if (type == 1) {
                accounts.add(new SavingsAccount(accNo, name, bal));
            } else {
                accounts.add(new CurrentAccount(accNo, name, bal));
            }
        }

        System.out.println("\n---- Banking Operations ----");
        for (BankAccount acc : accounts) {
            System.out.println("\nAccount Holder: " + acc.getHolderName());
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Balance: " + acc.getBalance());

            System.out.print("Enter amount to deposit for " + acc.getHolderName() + ": ");
            double dep = sc.nextDouble();
            acc.deposit(dep);

            System.out.print("Enter amount to withdraw for " + acc.getHolderName() + ": ");
            double wd = sc.nextDouble();
            acc.withdraw(wd);

            System.out.println("Updated Balance: " + acc.getBalance());
            System.out.println("Interest Earned: " + acc.calculateInterest());

            Loanable loanAcc = (Loanable) acc;
            System.out.print("Enter loan amount to apply for " + acc.getHolderName() + ": ");
            double loanAmt = sc.nextDouble();
            loanAcc.applyForLoan(loanAmt);

            if (loanAcc.calculateLoanEligibility()) {
                System.out.println("Loan Eligible ✅");
            } else {
                System.out.println("Loan Not Eligible ❌");
            }
        }
    }
}
