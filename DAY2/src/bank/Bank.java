package bank;

public class Bank {

	public static void main(String[] args) {
 
		Person smith = new Person("Smith", 23);
		Person kathy = new Person("Kathy", 26);
		
		Account A1 = new Account();
		A1.setAccHolder(smith);
		A1.setBalance(2000);
		
		Account A2 = new Account();
		A2.setAccHolder(kathy);
		A2.setBalance(3000);
		
		A1.deposit(2000);
		A2.withdraw(2700);
		
		
		System.out.println("Name: " + A1.getAccHolder().getName());
		System.out.println("Account Number: "+ A1.getAccNUM());
		System.out.println("Age: " + A1.getAccHolder().getAge());
		System.out.println("Balance: " + A1.getBalance());
		
		System.out.println("==================================");
		
		System.out.println("Name: " + A2.getAccHolder().getName());
		System.out.println("Account Number: "+ A2.getAccNUM());
		System.out.println("Age: " + A2.getAccHolder().getAge());
		System.out.println("Balance: " + A2.getBalance());
	
		
		System.out.println("==================================");

		SavingAccount savingsAccount = new SavingAccount();
        savingsAccount.setAccHolder(smith);
        savingsAccount.setBalance(3000);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setAccHolder(kathy);
        currentAccount.setBalance(2000);

       
        System.out.println("Initial Savings Account Balance: INR " + savingsAccount.getBalance());
        if (savingsAccount.withdraw(1500)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        System.out.println("Updated Savings Account Balance: INR " + savingsAccount.getBalance());
        System.out.println();

        System.out.println("Initial Current Account Balance: INR " + currentAccount.getBalance());
        if (currentAccount.withdraw(2500)) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Withdrawal failed.");
        }
        System.out.println("Updated Current Account Balance: INR " + currentAccount.getBalance());
  
		
	}

}
