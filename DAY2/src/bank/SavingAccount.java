package bank;

public class SavingAccount extends Account {

	private static final int miniBalance = 500;

	public SavingAccount() {
		super();
	}

	public boolean withdraw(double amount) {
		double temp = getBalance() - amount;
		if (temp < miniBalance) {
			System.out.println("You Cannot Withdraw as your bank balance is not enough for minimum criteria");
			return false;
		} else {
			setBalance(temp);
			return true;
		}
	}

}
