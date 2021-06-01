import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 1/4/21
 * Program to overload a function hline() such that:
 * hline() - draws a horizontal line 30 chars long using '-'
 * hline(int n) - draws horizontal line n chrs long with '*'
 * hline(int n, char c) - draws horizontal line n chars long using c
 */

public class HLineOverload27 {
    public static void hline() {
        for (int i = 0; i < 30; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void hline(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    
    public static void hline(int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
        System.out.println();
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Would you like to:\n1) call hline()\n2) call hline(int n)\n3) call hline(int n, char c)\nSelect option (1-3): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                hline();
                break;
            case 2:
                System.out.print("Enter n: ");
                int n = sc.nextInt();
                hline(n);
                break;
            case 3:
                System.out.print("Enter char c: ");
                char c = sc.next().charAt(0);
                System.out.print("Enter n: ");
                int num = sc.nextInt();
                hline(num, c);
                break;
            default:
                System.out.println("Invalid choice entered.");
        }
    }
}