import java.util.Scanner;
public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.printf("Withdrew %.2f. New balance: %.2f%n", amount, balance);
        }
    }

    public void displayBalance() {
        System.out.printf("Account %s (%s) - Balance: %.2f%n", accountNumber, accountHolder, balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Account holder name: ");
        String name = sc.nextLine();
        System.out.print("Account number: ");
        String acc = sc.nextLine();
        System.out.print("Initial balance: ");
        double bal = sc.nextDouble();
        BankAccount account = new BankAccount(name, acc, bal);

        boolean running = true;
        while (running) {
            System.out.println("\nChoose: 1-Deposit 2-Withdraw 3-Balance 4-Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        System.out.println("Thank you.");
        sc.close();
    }
}
