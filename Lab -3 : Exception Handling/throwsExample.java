// A class that represents a bank account
class BankAccount {
    // A field that stores the balance
    private double balance;

    // A constructor that initializes the balance
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // A method that withdraws money from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        // Check if the amount is greater than the balance
        if (amount > balance) {
            // Throw a custom exception
            throw new InsufficientFundsException("You do not have enough money in your account.");
        } else {
            // Subtract the amount from the balance
            balance -= amount;
        }
    }

    // A method that returns the balance
    public double getBalance() {
        return balance;
    }
}

// A custom exception class that extends Exception
class InsufficientFundsException extends Exception {
    // A constructor that calls the super constructor with a message
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// A class that tests the BankAccount class
class TestBankAccount {
    public static void main(String[] args) {
        // Create a BankAccount object with 1000 as initial balance
        BankAccount account = new BankAccount(1000);

        // Try to withdraw 500 from the account
        try {
            account.withdraw(500);
            System.out.println("Withdrawal successful. Your new balance is " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed. " + e.getMessage());
        }

        // Try to withdraw 600 from the account
        try {
            account.withdraw(600);
            System.out.println("Withdrawal successful. Your new balance is " + account.getBalance());
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed. " + e.getMessage());
        }
    }
}
