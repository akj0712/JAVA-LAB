//Java Program to calculate roots of Quadratic Equation

import java.util.*;

class QE{
	int a, b, c;
	double r1, r2, d, real, imag;
	Scanner sc = new Scanner(System.in);
	
	void input() {
	System.out.print("Enter the value of A: ");
	a = sc.nextInt();
	System.out.print("Enter the value of B: ");
	b = sc.nextInt();
	System.out.print("Enter the value of C: ");
	c = sc.nextInt();
	}
	
	void discriminant() {
		d = (b*b) - 4*a*c;
	}
	
	void calcRoot() {
		if(d == 0) {
			r1 = r2 = (-1 * b) / (2.0 * a);
			System.out.println("Roots are Real and Equal.");
			System.out.println("Roots are "+r1+" and "+r2);
		}
		else if(d > 0) {
			r1 = ( (-1 * b) + Math.sqrt(d) ) / ( 2.0 * a );
			r2 = ( (-1 * b) - Math.sqrt(d) ) / ( 2.0 * a );
			System.out.println("Roots are Real and Unequal.");
			System.out.println("Roots are "+r1+" and "+r2);
		}
		else {
			real = (-1 * b) / (2.0 * a);
			imag = Math.sqrt(-1*d) / ( 2.0 * a );
			System.out.println("Roots are Imaginary and Conjugate.");
			System.out.println("Roots are "+real+" + i "+imag+" and "+real+" - i "+imag);
			
		}
	}
}
public class QuadEq {
	public static void main(String[] args) {
		QE qe = new QE();
		qe.input();
		qe.discriminant();
		qe.calcRoot();
		
	}
}
