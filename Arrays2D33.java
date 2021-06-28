import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 8/6/21
 * Program to enter numbers in a 2-D array with
 * n rows and m columns and print it in a matrix format
 */

public class Arrays2D33 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of columns: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + m + " elements for row " + (i + 1));
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing ...");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}