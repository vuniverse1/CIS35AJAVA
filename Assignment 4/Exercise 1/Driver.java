
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		saver1.setSavingsBalance(2000);
		saver2.setSavingsBalance(3000);
		SavingsAccount.modifyInterestRate(.04);
		saver1.calcMonthlyInterest();
		saver2.calcMonthlyInterest();
		System.out.println("Testing for 4% interest rate");
		System.out.printf("\nYour new balance is $%.2f", saver1.getSavingsBalance());
		System.out.printf("\nYour new balance is $%.2f", saver2.getSavingsBalance());
		
		//modify interest rate to 5%
		
		System.out.printf("\n-----------------------------------------------");
		
		SavingsAccount.modifyInterestRate(.05);
		saver1.calcMonthlyInterest();
		saver2.calcMonthlyInterest();
		System.out.println("\nTesting for 5% interest rate");
		System.out.printf("\nYour new balance is $%.2f", saver1.getSavingsBalance());
		System.out.printf("\nYour new balance is $%.2f", saver2.getSavingsBalance());
	}

}
