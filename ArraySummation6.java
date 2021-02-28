import java.util.*;

/*
 * Program6
 * Kushal Galrani 10
 * Date: 18/02/21
 * A program ro accept values into two arrays of 10 cells each. It
 * stores the sum of corresponding cells into a third array
 */

public class ArraySummation6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements for first array:");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter 10 elements for second array:");
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[10];
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println("Printing sum of corresponding cells...");
        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }
    }
}