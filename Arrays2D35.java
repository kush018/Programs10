import java.util.*;

public class Arrays2D35 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + n + " elements for row " + (i + 1));
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array created");
        int s = 0;
        for (int i = 0, j = 0; i < n && j < n; i++, j++) {
            s += a[i][j];
        }
        System.out.println("Sum of left diagonal " + s);
        s = 0;
        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {
            s += a[i][j];
        }
        System.out.println("Sum of right diagonal " + s);
    }
}
