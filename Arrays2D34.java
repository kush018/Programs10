import java.util.*;

public class Arrays2D34 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter no. of column: ");
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + m + " elements for row " + (i + 1));
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array created");
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < m; j++) {
                s += a[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " is: " + s);
        }
        for (int j = 0; j < m; j++) {
            int s = 0;
            for (int i = 0; i < n; i++) {
                s += a[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " is: " + s);
        }
    }
}