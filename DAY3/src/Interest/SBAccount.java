package Interest;

public class SBAccount extends Account{

	public SBAccount(double interestRate, double amount) {
		
		super(interestRate, amount);
		
	}

	@Override
	public double calculateInterest() {
		
		return getAmount() * (getInterestRate() / 100);
		
	}
}
