import java.io.*;

/*
 * Kushal Galrani 10H
 * Date: 2/7/21
 * Program to input a String and display all the vowels present in it
 */

public class Strings51 {
	public static void main() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter a String: ");
		String s = br.readLine();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			System.out.print(ch); 
		}

		System.out.println();
	}
}
