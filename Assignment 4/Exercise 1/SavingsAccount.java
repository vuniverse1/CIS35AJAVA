public class SavingsAccount {
public static double annualInterestRate;
private double savingsBalance;
public SavingsAccount() {}

public SavingsAccount(double annualInterestRate, double savingsBalance) {
this.savingsBalance = savingsBalance;
}

public void calcMonthlyInterest() {
savingsBalance += savingsBalance * (annualInterestRate/12);
}

public static void modifyInterestRate(double newInterestRate) {
	annualInterestRate = newInterestRate;
}
public double getAnnualInterestRate() {
	return annualInterestRate;
}
public void setSavingsBalance(double savingsBalance) {
	this.savingsBalance = savingsBalance;
}
public double getSavingsBalance() {
	return savingsBalance;
	
}
public void deposit(double amt) {
	savingsBalance += amt;
}
public void withdraw(double amt) {
	savingsBalance -= amt;
}
}



