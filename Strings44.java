import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 28/6/21
 * Program to input a String and print each word in a separate line
 */

public class Strings44 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        
        s = s.trim();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') System.out.println();
            else System.out.print(s.charAt(i));
        }
    }
}