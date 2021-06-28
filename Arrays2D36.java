import java.util.*;

public class Arrays2D36 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in square array: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + n + " elements for row " + i);
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}