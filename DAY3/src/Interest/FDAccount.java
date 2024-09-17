package Interest;

public class FDAccount extends Account {

	private int noOfDays;
	private int ageOfHolder;
	
	public FDAccount(double interestRate, double amount, int noOfDays,
			int ageOfHolder) {
		
		super(interestRate, amount);
		this.noOfDays = noOfDays;
		this.ageOfHolder = ageOfHolder;
		
	}


//	
//	public void setInterestRate(double interestRate) {
//		this.interestRate = interestRate;
//	}
//
//	public double getAmount() {
//		return amount;
//	}
//
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getAgeOfHolder() {
		return ageOfHolder;
	}

	public void setAgeOfHolder(int ageOfHolder) {
		this.ageOfHolder = ageOfHolder;
	}
	
	

	@Override
	public double calculateInterest() {
//		System.out.println("interestRate: "+interestRate);
		return getAmount() * (getInterestRate() / 100);
		
	}
	
}
