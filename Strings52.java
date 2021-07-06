import java.io.*;

/*
 * Kushal Galrani, 10H
 * Date: 6/7/21
 * Program to input a String and display the total number of consonants in it 
 */

public class Strings52 {
	public static void main() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter a String: ");
		String s = br.readLine();
		s = s.toUpperCase();
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!Character.isLetter(ch)) continue;
			if ( !(ch == 'A' || ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U') )
				c++;
		}
		System.out.println("Number of consonants: " + c);
	}
}
