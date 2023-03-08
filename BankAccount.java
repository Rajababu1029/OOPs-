//Encapculation concept
public class BankAccount {
private double balance;

public void setBalance(double balance) throws  IllegalArgumentException {
	if (balance == 0) 
		throw new IllegalArgumentException("Do not enter zero ");
	if (balance <0) 
		throw new IllegalArgumentException("Do not pass negative value");
		this.balance = balance;
}

public double getBalance() {
	return balance;
}

public void deposit(int amt) throws IllegalArgumentException{
if (amt==0) 
	throw new IllegalArgumentException("Do not pass zero");
if (amt<0) 
	throw new IllegalArgumentException("Do not pass negative value");
	
	this.balance= balance+amt;
}
public void withdraw(int amt) {
	if (amt==0) 
		throw new IllegalArgumentException("Do not pass zero");
	if (amt<0) 
		throw new IllegalArgumentException("Do not pass negative value");
	
	this.balance= balance-amt;
}

}
