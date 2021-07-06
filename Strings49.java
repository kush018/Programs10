import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 2/7/21
 * Program to input a String and print the total number of upper case letters, 
 * lower case letters, digits and special characters
 */

public class Strings49 {
	public static void main() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String: ");
		String s = sc.nextLine();

		int lower = 0, upper = 0, digits = 0, special = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ('a' <= ch && ch <= 'z') lower++;
			else if ('A' <= ch && ch <= 'Z') upper++;
			else if ('0' <= ch && ch <= '9') digits++;
			else special++;
		}

		System.out.println("Upper case chars: " + upper);
		System.out.println("Lower case chars: " + lower);
		System.out.println("Digit chars: " + digits);
		System.out.println("Special chars: " + special);
	}
}
