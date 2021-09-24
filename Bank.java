

import java.util.Date;

public class Bank {
	private int id;
	private double balance;
	private Date dateCreated;

	
	Bank() {
		id = 0;
		balance = 0;
		dateCreated = new Date(); 
	}

	
	Bank(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}

	
	public void setId(int newId) {
		id = newId;
	}

	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	
	public int getId() {
		return id;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public String getDateCreated() {
		return dateCreated.toString();
	}


	
	public void withdraw(double amount) {
		balance -= amount;
	}

	
	public void deposit(double amount) {
		balance += amount;
	}
}
