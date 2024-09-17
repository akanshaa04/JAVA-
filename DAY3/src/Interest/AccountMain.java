package Interest;

import java.util.Scanner;

public class AccountMain {

	private static double getFDInterestRate(double amountFD, int daysFD, int ageFD) {

		double interestRate = 0;
		if (amountFD <= 10000000) {
			if (daysFD >= 7 && daysFD <= 14) {
				interestRate = (ageFD >= 60) ? 5.00 : 4.50;
			} else if (daysFD >= 15 && daysFD <= 29) {
				interestRate = (ageFD >= 60) ? 5.25 : 4.75;
			} else if (daysFD >= 30 && daysFD <= 45) {
				interestRate = (ageFD >= 60) ? 6.00 : 5.50;
			} else if (daysFD >= 45 && daysFD <= 60) {
				interestRate = (ageFD >= 60) ? 7.50 : 7.00;
			} else if (daysFD >= 61 && daysFD <= 184) {
				interestRate = (ageFD >= 60) ? 8.00 : 7.50;
			} else if (daysFD >= 185 && daysFD <= 365) {
				interestRate = (ageFD >= 60) ? 8.50 : 8.00;
			} else {
				System.out.println("Invalid number of days.");
			}
		} else {
			// Rates for amounts above 1 Crore
			if (daysFD >= 7 && daysFD <= 14) {
				interestRate = 6.50;
			} else if (daysFD >= 15 && daysFD <= 29) {
				interestRate = 6.75;
			} else if (daysFD >= 30 && daysFD <= 45) {
				interestRate = 6.75;
			} else if (daysFD >= 45 && daysFD <= 60) {
				interestRate = 8.00;
			} else if (daysFD >= 61 && daysFD <= 184) {
				interestRate = 8.50;
			} else if (daysFD >= 185 && daysFD <= 365) {
				interestRate = 10.00;
			} else {
				System.out.println("Invalid number of days.");
			}
		}
		return interestRate;
	}

	private static double getRDInterestRate(int monthsRD, int ageRD) {

		double interestRate = 0;
		if (monthsRD == 6) {
			interestRate = (ageRD >= 60) ? 8.00 :7.50 ;
		} else if (monthsRD == 9) {
			interestRate = (ageRD >= 60) ? 8.25 : 7.75;
		} else if (monthsRD == 12 ) {
			interestRate = (ageRD >= 60) ? 8.50 : 8.00;
		} else if (monthsRD == 15) {
			interestRate = (ageRD >= 60) ? 8.75 : 8.25;
		} else if (monthsRD == 18) {
			interestRate = (ageRD >= 60) ? 9.00 : 8.50;
		} else if (monthsRD == 21) {
			interestRate = (ageRD >= 60) ? 9.25 : 8.75;
		} else {
			System.out.println("Invalid number of days.");
		}
		
		return interestRate;
	}

	public void validateAmount(double Amount) throws InvalidAmountException {
		if (Amount <= 0) {
			throw new InvalidAmountException("Your amount is not sufficient.");
		}
	}

	public void validateDays(int days) throws InvalidDaysException {
		if (days <= 0) {
			throw new InvalidDaysException("Invalid Input");
		}
	}

	public static void main(String st[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Select one Interest Calculator: \n" + "1. SB \n" + "2. FD \n" + "3. RD \n" + "4. Exit");
		int input = scan.nextInt();
		AccountMain AM = new AccountMain();

		if (input == 1) {
			System.out.println("Enter the Average amount in your account: ");
			double amountSB = scan.nextDouble();

			try {

				AM.validateAmount(amountSB);

				System.out.println("Select Account Type: \n" + "1. Normal (4%) \n" + "2. NRI (6%)");
				int accountType = scan.nextInt();

				double interestRate;

				if (accountType == 1) {
					interestRate = 4.0;
				} else if (accountType == 2) {
					interestRate = 6.0;
				} else {
					System.out.println("Invalid account type.");
					return;
				}

				SBAccount Sb = new SBAccount(amountSB, interestRate);
				System.out.println("interest rate: " + Sb.calculateInterest());

				double Interest = Sb.calculateInterest();
				System.out.println("Interest gained: " + Interest);
			} catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			}

		} else if (input == 2) {
			System.out.println("Enter the FD Amount: ");
			double amountFD = scan.nextDouble();

			try {

				AM.validateAmount(amountFD);
				System.out.println("Enter the number of days: ");
				int daysFD = scan.nextInt();

				try {
					AM.validateDays(daysFD);
					System.out.println("Enter Age: ");
					int ageFD = scan.nextInt();
					if (ageFD <= 12) {
						System.out.println("Enter valid Age.");
						return;
					}
					if (amountFD <= 10000000 && amountFD > 0) {

						double interestFD = getFDInterestRate(amountFD, daysFD, ageFD);
						FDAccount fd = new FDAccount(interestFD, amountFD, daysFD, ageFD);
						double Interest = fd.calculateInterest();
						System.out.println("Interest gained: " + Interest);

					} else if (amountFD > 10000000) {

						double interestFD = getFDInterestRate(amountFD, daysFD, ageFD);
						FDAccount fd = new FDAccount(interestFD, amountFD, daysFD, ageFD);
						double Interest = fd.calculateInterest();
						System.out.println("Interest gained: " + Interest);

					} else {
						System.out.println("Invalid Amount.");
						return;
					}
				} catch (InvalidDaysException e) {
					System.out.println(e.getMessage());
				}

			} catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			}

		}else if(input==3) {
			System.out.println("Enter the RD Amount: ");
			double amountRD = scan.nextDouble();
			try {

				AM.validateAmount(amountRD);
				System.out.println("Enter the number of months: ");
				int monthsRD = scan.nextInt();

				
					System.out.println("Enter Age: ");
					int ageRD = scan.nextInt();
					
					double interestRD = getRDInterestRate(monthsRD, ageRD);
					System.out.println("interestRD " + interestRD);
					RDAccount rd = new RDAccount(interestRD, amountRD, monthsRD);
					double Interest = rd.calculateInterest();
					System.out.println("Interest gained: " + Interest);

				

			} catch (InvalidAmountException e) {
				System.out.println(e.getMessage());
			}
		}else {
			return;
		}

	}
}
