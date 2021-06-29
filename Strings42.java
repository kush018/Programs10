import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 28/6/21
 * Program to input a String and print the total number of vowels in it
 */

public class Strings42 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') c++;
        }
        System.out.println("Number of vowels: " + c);
    }
}