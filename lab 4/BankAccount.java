package lab_4;

public class BankAccount {
	private double balance; 
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    protected void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.checkBalance();
        account.withdraw(2000);
        account.checkBalance();
    }
}
