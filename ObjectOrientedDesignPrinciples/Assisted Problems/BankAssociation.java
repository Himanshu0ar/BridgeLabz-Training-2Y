import java.util.HashMap;

class Customer {
    String name;
    int customerId;
    double balance;

    Customer(String name, int customerId, double balance) {
        this.name = name;
        this.customerId = customerId;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + " (ID: " + customerId + ") has balance: " + balance);
    }
}

class Bank {
    String bankName;
    HashMap<Integer, Customer> customers;

    Bank(String bankName) {
        this.bankName = bankName;
        customers = new HashMap<>();
    }

    void openAccount(Customer c) {
        customers.put(c.customerId, c);
        System.out.println("Account opened for " + c.name + " in " + bankName);
    }

    void showCustomers() {
        System.out.println("Bank: " + bankName + " Customers:");
        for (Customer c : customers.values()) {
            c.viewBalance();
        }
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank");
        
        Customer c1 = new Customer("Amit", 101, 5000);
        Customer c2 = new Customer("Riya", 102, 12000);

        bank.openAccount(c1);
        bank.openAccount(c2);

        System.out.println();
        bank.showCustomers();
    }
}
