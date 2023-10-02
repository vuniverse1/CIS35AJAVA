
public class SpecialSavings extends SavingsAccount { //child class, receive all variables and methods
public SpecialSavings() {}
public SpecialSavings(double annualInterestRate, double savingsBalance) {
	super(annualInterestRate, savingsBalance);
	}
@Override
public void calcMonthlyInterest() {
	if(getSavingsBalance() > 10000) {  //if return savings balance exceeds 10k
		modifyInterestRate(.1); //interest rate is 10%
	}
	else {
		modifyInterestRate(0.04); //else interest rate stays at 4%
		}
	super.calcMonthlyInterest(); //then calculate the monthly interest rate
}

}
