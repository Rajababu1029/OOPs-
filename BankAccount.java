
public class BankAccount implements RBIBank{
private double balance;

public void setBalance(double balance){
	validationCheck(balance);
		this.balance = balance;
}

public double getBalance() {
	return balance;
}

public void deposit(double amt){
	validationCheck(amt);
	
	this.balance= balance+amt;
}
public void compoundInterest(double principal, double interestRate, int time) {
	validationCheck(principal);
	validationCheck(interestRate);
	validationCheck(time);	
	double CI = principal*Math.pow(1+interestRate/100, time)-principal;
	System.out.println("Compound Interest: "+CI);
}

public void withdraw(double amt){
	validationCheck(amt);
	this.balance= balance-amt;
}
public void validationCheck(double amt) throws  IllegalArgumentException{
	if (amt==0) 
		throw new IllegalArgumentException("Do not pass zero");
	if (amt<0) 
		throw new IllegalArgumentException("Do not pass negative value");
 	}
}

