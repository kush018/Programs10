import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 28/6/21
 * Program to input a String and print the total number of individual vovels in it
 */

public class Strings43 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        for (int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);
            switch (c) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++;
            }
        }
        System.out.println("Occurences of a" + a);
        System.out.println("Occurences of e" + e);
        System.out.println("Occurences of i" + i);
        System.out.println("Occurences of o" + o);
        System.out.println("Occurences of u" + u);
    }
}