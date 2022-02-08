import java.util.*;

public class StringVowel {

	public static void main(String[] args) {
		String s;
		char ch;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		s = sc.nextLine();
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
				count = count + 1;
			}
		}
		System.out.println("No. of vowels = " + count);
		sc.close();
	}

}
