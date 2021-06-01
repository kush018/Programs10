import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 16/3/21
 * Program with an overloaded function compare() that can compare
 * integers, characters and String
 */

public class OverloadedComparator23 {
    public static void compare(int x, int y) {
        System.out.println(x > y ? x : y);
    }
    
    public static void compare(char x, char y) {
        System.out.println(x > y ? x : y);
    }
    
    public static void compare(String x, String y) {
        System.out.println(x.length() > y.length() ? x : y);
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to compare:\n1) Integers\n2) Characters\n3) Strings\nEnter your choice (1-3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the two integers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                compare(a, b);
                break;
            case 2:
                System.out.println("Enter the two characters:");
                char c = sc.next().charAt(0);
                char d = sc.next().charAt(0);
                compare(c, d);
                break;
            case 3:
                System.out.println("Enter the two Strings:");
                sc.nextLine();
                String e = sc.nextLine();
                String f = sc.nextLine();
                compare(e, f);
                break;
        }
    }
}