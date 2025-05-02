package lab_7;

public class BankDemo {
	 public static void main(String[] args) {
	        Account account = new Account(1000);
	        account.deposit(500);
	        account.withdraw(300);
	        account.withdraw(1500);
	    }
}
