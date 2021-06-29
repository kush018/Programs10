import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 29/6/21
 * Program to input a String and change the case of each character of the String
 * and display the new String
 */

public class Strings45 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLowerCase(ch)) s += Character.toUpperCase(ch);
            else if (Character.isUpperCase(ch)) s += Character.toLowerCase(ch);
            else s += ch;
        }
        System.out.println(s1);
    }
}