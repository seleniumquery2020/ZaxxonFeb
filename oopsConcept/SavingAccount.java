package oopsConcept;

public class SavingAccount implements BankOperations{

	
	public void deposit(int amount) {
		
		System.out.println("Deposit Rs."+amount+" in Saving Account");
		
	}

	@Override
	public void withdraw() {
		
		System.out.println("Withdraw from Saving Account");
		
	}
	
	public void balanceCheck() {
		System.out.println("Saving Account Balance = Rs.523698");
	}
	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.deposit(1000);
		savingAccount.withdraw();
		savingAccount.balanceCheck();
		
		BankOperations bankOperations = new SavingAccount();
		bankOperations.deposit(500);
		bankOperations.withdraw();
		
	}

}
