import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 29/6/21
 * Program to input a String and replace every 'e' with '*'
 * and print the new String
 */

public class Strings46 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String s1 = s.replace('e', '*');
        System.out.println(s1);
    }
}