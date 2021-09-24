


public class TestBank {
public static void main(String[] args) {
		
		Bank account = new Bank(1122, 20000);


		
		account.withdraw(2500);

		
		account.deposit(3000);

		
		System.out.println("\n          Account Statement");
		System.out.println("------------------------------------------");
		System.out.println("Account ID: " + account.getId());
		System.out.println("Date created: " + account.getDateCreated());
		System.out.printf("Balance: $%.2f\n", account.getBalance());
	}
}
