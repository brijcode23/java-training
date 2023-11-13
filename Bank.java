
class NegativeDepositException extends Exception {
    public NegativeDepositException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class Bank {
    private String customerName;
    private String accountNumber;
    private double balance;

    // Constructor
    public Bank(String customerName, String accountNumber, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void depositMoney(double depositAmount) throws NegativeDepositException {
        if (depositAmount < 0) {
            throw new NegativeDepositException("Deposit amount must be positive.");
        }
        this.balance += depositAmount;
    }

    // Method to withdraw money
    public void withdrawMoney(double withdrawalAmount) throws InsufficientBalanceException {
        if (balance >= withdrawalAmount) {
            balance -= withdrawalAmount;
        } else {
            String message = "You don't have sufficient balance to withdraw " + withdrawalAmount +
                    ". Your current balance is " + balance + ".";
            throw new InsufficientBalanceException(message);
        }
    }

    // Example usage
    public static void main(String[] args) {
        try {
            // Creating an instance of the Bank class
            Bank myBank = new Bank("Ranjanish", "524305", 30000);

            // Accessing properties using getters
            System.out.println("Customer Name: " + myBank.getCustomerName());
            System.out.println("Account Number: " + myBank.getAccountNumber());
            System.out.println("Balance: " + myBank.getBalance());

            // Depositing money
            myBank.depositMoney(1000);
            System.out.println("New Balance after deposit: " + myBank.getBalance());

            try {
                myBank.depositMoney(-1000);
            } catch (NegativeDepositException nde) {
                System.out.println("Error: " + nde.getMessage());
            }

            // Withdrawing money more than the balance
            try {
                myBank.withdrawMoney(50000);
            } catch (InsufficientBalanceException ibe) {
                System.out.println("Error: " + ibe.getMessage());
            }

            // Trying to withdraw
            myBank.withdrawMoney(20000);

            System.out.println("Updated Balance after withdrawal: " + myBank.getBalance());


        } catch (NegativeDepositException nde) {
            System.out.println("Error: " + nde.getMessage());
        } catch (InsufficientBalanceException ibe) {
            System.out.println("Error: " + ibe.getMessage());
        }
    }
}
/*Output
PS C:\Users\brije\OneDrive\Documents\noob>  c:; cd 'c:\Users\brije\OneDrive\Documents\noob'; & 'C:\Users\brije\openjdk-21_windows-x64_bin\jdk-21\bin\java.exe' '-XX:+ShowCodeDetailsInExceptionMessages' '-cp' 'C:\Users\brije\AppData\Roaming\Code\User\workspaceStorage\447a19b93fc2999aab1b0c2e28708398\redhat.java\jdt_ws\noob_d6de1f5c\bin' 'Bank' 
Customer Name: Ranjanish
Account Number: 524305
Balance: 30000.0
New Balance after deposit: 31000.0
Error: Deposit amount must be positive.
Error: You don't have sufficient balance to withdraw 50000.0. Your current balance is 31000.0.
Updated Balance after withdrawal: 11000.0
PS C:\Users\brije\OneDrive\Documents\noob>
 */