import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 10/6/21
 * Program to enter 9 numbers into a two dimensional array and print the
 * matrix displaying only the even numbers
 */

public class Array2DInputer32 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter 3 numbers for " + (i + 1) + " row");
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Printing ...");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] % 2 == 0) {
                    System.out.print(a[i][j]);
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}