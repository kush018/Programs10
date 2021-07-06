import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 29/6/21
 * Program to input a word and print whether it is a palindrome
 * or not
 */

public class Strings48 {
	public static void main() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word: ");
		String s = sc.nextLine();
		int l = 0, u = s.length() - 1;
		boolean isPalindrome = true;
		while (l < u) {
			if (s.charAt(l) != s.charAt(u)) {
				isPalindrome = false;
				break;
			}
			l++;
			u--;
		}
		if (isPalindrome) System.out.println("The word is a palindrome");
		else System.out.println("The word is NOT a palindrome");
	}
}
