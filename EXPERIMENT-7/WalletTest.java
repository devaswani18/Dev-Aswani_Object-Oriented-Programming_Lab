interface Wallet {
    void addFunds(double amount);
    void spendFunds(double amount);
}
class DigitalWallet implements Wallet {
    private double balance;
    public DigitalWallet(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added " + amount + " to wallet. New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive value.");
        }
    }

    @Override
    public void spendFunds(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Spent " + amount + " from wallet. Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
public class WalletTest {
    public static void main(String[] args) {
        
        Wallet myWallet = new DigitalWallet(1000);
        myWallet.addFunds(500);
        myWallet.spendFunds(200);
        myWallet.spendFunds(1500); 
        myWallet.addFunds(-50);
        myWallet.spendFunds(300);
        System.out.println("Final Wallet Balance: " + ((DigitalWallet) myWallet).getBalance());
    }
}