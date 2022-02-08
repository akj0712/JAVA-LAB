import java.util.*;

public class StringCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) != ' ')
				count = count + 1;
		}
		System.out.print("No. of Alphanumeric Characters = "+ count);
		sc.close();

	}

}
