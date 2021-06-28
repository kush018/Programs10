import java.util.*;

/*
 * Kushal Galrani 10 H
 * Date: 28/6/21
 * Program to input a String and print the number of words in it
 */

public class Strings40 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        
        s = s.trim();
        int words = 1;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') words++;
        }
        
        System.out.println("Number of words: " + words);
    }
}