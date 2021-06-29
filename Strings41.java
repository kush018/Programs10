import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 18/6/21
 * Program to input a String and print the number of spaces in it
 */

public class Strings41 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        
        int spc = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') spc++;
        }
        
        System.out.println("The number of spaces: " + spc);
    }
}