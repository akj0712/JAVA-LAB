import java.util.*;

public class StringMid {
	public static void main(String[] args) {
		String s;
		int len, mid;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");;
		s = sc.nextLine();
		len = s.length();
		mid = len / 2;
		if(len % 2 != 0)
			System.out.printf("Middle Character is %s\n", s.charAt(mid));
		else
			System.out.printf("Middle character are %s and %s\n", s.charAt(mid-1), s.charAt(mid));
		sc.close();
	}
}
