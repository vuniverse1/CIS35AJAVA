
public class SpecialDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpecialSavings saver1 = new SpecialSavings();
		SpecialSavings saver2 = new SpecialSavings();
		saver1.setSavingsBalance(3000.00);
		saver2.setSavingsBalance(2000.00);
		
		saver1.deposit(12000);
        saver1.deposit(100);
        saver2.deposit(500);
      
        saver1.calcMonthlyInterest();
        saver2.calcMonthlyInterest();
        System.out.printf("\nAfter deposit");
        System.out.printf("\nYour new saver1 balance is $%.2f", saver1.getSavingsBalance());
		System.out.printf("\nYour new saver 2 balance is $%.2f", saver2.getSavingsBalance());
       
		saver1.withdraw(9750);
        saver2.withdraw(180);
        System.out.printf("\nAfter withdrawal");
        System.out.printf("\nYour new saver1 balance is $%.2f", saver1.getSavingsBalance());
		System.out.printf("\nYour new saver2 balance is $%.2f", saver2.getSavingsBalance());
        
	}

}
