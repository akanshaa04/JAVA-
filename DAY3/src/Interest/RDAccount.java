package Interest;

public class RDAccount extends Account {

	private int noOfMonths;
	private double monthlyAmount;
	
	public RDAccount(double interestRate, double amount, int noOfMonths) {
		super(interestRate, amount);
		
		this.noOfMonths= noOfMonths;
	}
	
	@Override
	public double calculateInterest() {
		System.out.println("interestRate: "+getInterestRate());
		return getAmount() * (getInterestRate() / 100);
		
	}

	public int getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public double getMonthlyAmount() {
		return monthlyAmount;
	}

	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}
}
