//Java Program to calculate employee salary

import java.util.*;

public class EmployeeSalary {
	public static void main(String[] args) {
		String name, eid;
		double bsalary;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee ID: ");
		eid = sc.nextLine();
		System.out.print("Enter Employee Name: ");
		name = sc.nextLine();
		System.out.print("Enter Basic Salary: ");
		bsalary = sc.nextDouble();
		double da = 0.4 * bsalary;
		double hra = 0.2 * bsalary;
		double cca = 250;
		double pf = 0.1 * bsalary;
		double pt = 100;
		double gross = bsalary + da + hra + cca;
		double it = 0.1 * gross;
		double deduct = pf + pt + it;
		double netIncome = gross - deduct;
		System.out.print("The salary of Employee "+name+", bearing ID: "+eid+", is Rs. "+netIncome);
		sc.close();
	}
}
