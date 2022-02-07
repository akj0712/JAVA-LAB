import java.util.Scanner;

//Write a program to sort a list of elements in ascending and descending order and show exception handling

class Sort{
	void sortAscend(int arr[], int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1; j++) {
				if(arr[j] > arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
	}
	
	void sortDescend(int arr[], int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1; j++) {
				if(arr[j] < arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
				}
			}
		}
	}
	void printArray(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
}

public class ExceptionalHandling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sort s = new Sort();
		int n;
		System.out.print("Enter the number of elements: ");
		n = sc.nextInt();
		int arr[] = new int[5];
		System.out.print("Enter "+n+" Elements: ");
		for(int i = 0; i < n; i++) {
			try {
				arr[i] = sc.nextInt();
			}
			catch(Exception e) {
				System.out.println ("Index out of Bounds "+e);
				System.exit(0);
			}
		}
		System.out.print ("Entered Elements are: ");
		s.printArray(arr, n);
		System.out.println(" ");
		System.out.print ("Ascending Order: ");
		s.sortAscend(arr, n);
		s.printArray(arr, n);
		System.out.println(" ");
		System.out.print ("Descending Order: ");
		s.sortDescend(arr, n);
		s.printArray(arr, n);
		System.out.println(" ");
		
		sc.close();
	}
}
