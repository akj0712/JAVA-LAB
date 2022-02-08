import java.util.*;
public class StringPalindrome {
	public static void main(String[] args) {
		String original, reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		original = sc.nextLine();
		original = original.toLowerCase();
		for(int i = original.length() - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i); 
		}
		System.out.println("Original String: " + original);
		System.out.println("Reverse String: " + reverse);
		if(original.equals(reverse)) {
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
		sc.close();
	}
}
