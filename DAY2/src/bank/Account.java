package bank;

import java.util.Random;

public class Account {
	private static final Random random = new Random();
	private long accNUM;
	private double balance;
	private Person accHolder;
	private static final double minBalance = 500.0;

	public Account() {
		this.accNUM = generateRandomAccountNumber();
	}

	private long generateRandomAccountNumber() {
		return Math.abs(random.nextLong());
	}

	public long getAccNUM() {
		return accNUM;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setBalance(double balance) {
		if (balance < minBalance) {
			throw new IllegalArgumentException("Initial balance cannot be less than INR " + minBalance);
		}
		this.balance = balance;
	}

	public void deposit(double balance) {
		if (balance > 0)
			this.balance += balance;
		else {
			throw new IllegalArgumentException("Deposit amount must be positive");
		}
	}

	public boolean withdraw(double amount) {
		double temp = this.balance - amount;
		if (temp < minBalance) {
			System.out.println("You Cannot Withdraw as your bank balance is not enough for minimum criteria");
			return false;
		} else {
			this.balance = temp;
			return true;
		}
	}

	public double getBalance() {
//		System.out.println(balance);
		return balance;
	}
}
