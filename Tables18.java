import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 9/3/21
 * Program using functions to print table of n (no return; with parameters)
 */

public class Tables18 {
    public static void displayTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which table would you like: ");
        int n = sc.nextInt();
        displayTable(n);
    }
}