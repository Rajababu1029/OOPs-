import java.util.InputMismatchException;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		BankAccount bankAcc = new BankAccount();
		try {
			Scanner scn =  new Scanner(System.in);
			System.out.println("Enter the balance");
						
			
			Double balance = scn.nextDouble();
			bankAcc.setBalance(balance);
			
			System.out.println("Enter the Amount for Deposit");
			double Damt = scn.nextDouble();
			bankAcc.deposit(Damt);
			System.out.println("Current Balance:"+bankAcc.getBalance());
	
			System.out.println("Enter the Amount for withdraw");
			double Wamt = scn.nextDouble();
			bankAcc.withdraw(Wamt);
			
			System.out.println("Current Balance:"+bankAcc.getBalance() + "after the withdrawl transaction" );
			
			System.out.println("Enter the principal amount");
			double principal = scn.nextDouble();
			System.out.println("Enter the rate of interest");
			double interestrate = scn.nextDouble();
			System.out.println("Enter the time period");
			int time = scn.nextInt();
			bankAcc.compoundInterest(principal, interestrate, time);
			
			System.out.println("Current Balance:"+bankAcc.getBalance());

			
		} catch (InputMismatchException e) {
			System.out.println("Enter only number ");
		   }
			catch(Exception e) {
				System.out.println(e.getMessage());
			}

	}
}

