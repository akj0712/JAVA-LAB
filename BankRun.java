//Write a program to calculate the interest amount based on the rate of interest defined for different banks using the concept of interface. Also calculate and display the maturity amount

import java.util.*;

interface Bank{
	Scanner sc = new Scanner(System.in);
	void getDetails();
	void calcInterest();
	void calcAmount();
}

class SBI implements Bank{
	String s;
	double principle;
	double time;
	double interest;
	double roi = 8.5;
	
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.print("Enter Account Holder Name: ");
		s = sc.nextLine();
		System.out.print("Enter principle ammount: ");
		principle = sc.nextInt();
		System.out.print("Enter Time Period: ");
		time = sc.nextInt();
	}

	@Override
	public void calcInterest() {
		// TODO Auto-generated method stub
		interest = (principle*time*roi/100);
		System.out.print("Interest is: " + interest);
		System.out.println("");
	}

	@Override
	public void calcAmount() {
		// TODO Auto-generated method stub
		double amount = principle + interest;
		System.out.print("Amount is: " + amount);
		System.out.println("");
		System.out.println("");
	}
	
}

class CanaraBank implements Bank{
	String s;
	double principle;
	double time;
	double interest;
	double roi = 8.5;
	
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		System.out.print("Enter Account Holder Name: ");
		s = sc.next();
		System.out.print("Enter principle ammount: ");
		principle = sc.nextInt();
		System.out.print("Enter Time Period: ");
		time = sc.nextInt();
	}

	@Override
	public void calcInterest() {
		// TODO Auto-generated method stub
		interest = (principle*time*roi/100);
		System.out.print("Interest is: " + interest);
		System.out.println("");
	}

	@Override
	public void calcAmount() {
		// TODO Auto-generated method stub
		double amount = principle + interest;
		System.out.print("Amount is: " + amount);
	}
	
}


public class BankRun {
	public static void main(String[] args) {
		Bank b;
		SBI sbi = new SBI();
		CanaraBank cb = new CanaraBank();
		b = sbi;
		b.getDetails();
		b.calcInterest();
		b.calcAmount();
		b = cb;
		b.getDetails();
		b.calcInterest();
		b.calcAmount();
	}
}
