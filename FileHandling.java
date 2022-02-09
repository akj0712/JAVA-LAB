import java.io.*;

public class FileHandling {
	public static void main(String[] args) throws IOException, FileNotFoundException{
		char c;
		int i;
		FileInputStream fin = new FileInputStream ("E:\\Study Material\\Eclipse-Workspace\\Lab-Manual\\src\\FileHandling.txt");
		FileOutputStream fout = new FileOutputStream ("E:\\\\Study Material\\\\Eclipse-Workspace\\\\Lab-Manual\\\\src\\\\FileHandling.txt"); //Set path of Test.txt
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		System.out.println ("Enter the characters: q to quit");
		do {
		c = (char)br.read();
		if (c != 'q')
		fout.write(c);
		} while (c != 'q');
		do {
		i = fin.read();
		if (i != -1)
		System.out.print ((char)i);
		} while (i != -1);
		fin.close();
		fout.close();
	}
}
