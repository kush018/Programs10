import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 22/6/21
 * Program to input a String and print its letters on separate lines
 */

public class Strings39 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Printing letters ...");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }
}