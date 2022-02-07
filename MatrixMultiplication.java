//Java Program to multiply two matrices

import java.util.*;

class MatrixInput{
	int row1, column1, row2, column2, i, j, k;
	int a[][] = new int [10][10];
	int b[][] = new int [10][10];
	int c[][] = new int [10][10];
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.print("Enter the number of rows of matrix 1: ");
		row1 = sc.nextInt();
		System.out.print("Enter the number of columns of matrix 1: ");
		column1 = sc.nextInt();
		System.out.print("Enter the number of rows of matrix 2: ");
		row2 = sc.nextInt();
		System.out.print("Enter the number of columns of matrix 2: ");
		column2 = sc.nextInt();
		if(column1 != row2) {
			System.out.print("Multiplication not possible");
			System.exit(0);
		}
		else {
			System.out.print("Enter the Elements of Matrix1: ");
			for(i = 0; i < row1; i++) {
				for(j = 0; j < column1; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.print("Enter the Elements of Matrix2: ");
			for(i = 0; i < row1; i++) {
				for(j = 0; j < column1; j++) {
					b[i][j] = sc.nextInt();
				}
			}
		}
	}
	
	void multiply() {
		c[i][j] = 0;
		for(i = 0; i < row1; i++) {
			for(j = 0; j < column2; j++) {
				for(k = 0; k < column1; k++) {
					c[i][j] = c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
	}
	
	void display() {
		for(i = 0; i < row1; i++) {
			for(j = 0; j < column2; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}


public class MatrixMultiplication {

	public static void main(String[] args) {
		MatrixInput MI = new MatrixInput();
		MI.input();
		MI.multiply();
		MI.display();
	}

}
