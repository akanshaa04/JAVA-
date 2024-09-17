package Interest;

public abstract class Account {
	private double interestRate;
	private double amount;
	
	public Account(double interestRate, double amount) {
		super();
		this.interestRate = interestRate;
		this.amount = amount;
	}

	
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}



	public abstract double calculateInterest();
	
	@Override
    public String toString() {
		return "I am in Account class";
	}
}
