/*
 * Kushal Galrani 10H
 * Date: 5/6/21
 * Program to initialise 9 numbers into a 2-D array and print
 * it out in matrix format using tab space character
 */
public class Arrays2D30 {
    public static void main() {
        int a[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}