import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("Wpłata", amount));
        System.out.println("Wpłacono: " + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Niewystarczające środki na koncie.");
        } else {
            balance -= amount;
            transactionHistory.add(new Transaction("Wypłata", amount));
            System.out.println("Wypłacono: " + amount);
        }
    }

    public void displayTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("Brak historii transakcji.");
        } else {
            System.out.println("Historia transakcji:");
            for (Transaction t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    public void addTransaction(Transaction transaction) {
        transactionHistory.add(transaction);
    }
}
