package bank;

public class CurrentAccount extends Account{

	private double overdraftLimit = 5000;
	public CurrentAccount() {
		super();
	}
	
	@Override
    public boolean withdraw(double balance) {
        double newBalance = getBalance() - balance;
        // Allow withdrawal if the new balance is greater than or equal to -overdraftLimit
        if (newBalance < -overdraftLimit) {
            System.out.println("You cannot withdraw as your balance with overdraft exceeds the limit.");
            return false;
        } else {
            setBalance(newBalance);
            return true;
        }
    }}
