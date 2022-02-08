//Write a java program to implement a stack using generic class and methods

import java.util.*;
class Stack <E>{
	E stck[];
	int top;
	final int size = 10;
	
	@SuppressWarnings("unchecked")
	Stack(){
		stck = (E[])new Object[size];
		top = -1;
	}
	
	void push(E item) {
		if(top == size - 1)
			System.out.print("STACK OVERFLOW");
		else {
			top = top + 1;
			stck[top] = item;
		}
	}
	E pop() {
		if(top < 0) {
			System.out.print("STACK UNDERFLOW\n");
			return null;
		}
		else
			return stck[top--];
	}
}

public class Stacks {
	public static void main(String[] args) {
		Stack<Integer> si = new Stack<Integer>();
		Stack<Double> sd = new Stack<Double>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element of interger stack: ");
		for(int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			si.push(n);
		}
		System.out.println("Enter the element of Double Stack");
		for(int i = 0; i < 10; i++) {
			Double d = sc.nextDouble();
			sd.push(d);
		}
		System.out.println("Element of Integer Stcak are: ");
		for(int i = 0; i < 10; i++)
			System.out.println(si.pop());
		System.out.println("Element of Integer Stcak are: ");
		for(int i = 0; i < 10; i++)
			System.out.println(sd.pop());
		sc.close();
		
	}
}
