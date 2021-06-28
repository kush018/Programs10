/*
 * Kushal Galrani 10H
 * Date: 10/6/21
 * Program to initialise 9 characters into a double dimensional array and print it
 * in reverse order in a matrix format using tab
 */

public class Arrays2D31 {
    public static void main() {
        char[][] a = {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}};
        for (int i = 2; i >= 0; i--) {
            for (int j = 2; j >= 0; j--) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}