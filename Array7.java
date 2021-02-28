/*
 * Kushal Galrani 10
 * Date: 25/2/21
 * Program that initialises two arrays and combines them into a
 * single array
 */

public class Array7 {
    public static void main() {
        int[] X = {5, -3, -2, 1, 0, 12, 14, 16, 25, 13};
        int[] Y = {6, 5, 10, 15, 18, 20, 22, 30};
        int[] Z = new int[18];
        for (int i = 0, j = 0, k = 0; i < 18; i++) {
            if (i % 2 == 0) {
                if (j < 10) {
                    Z[i] = X[j];
                    j++;
                } else if (k < 8) {
                    Z[i] = Y[k];
                    k++;
                }
            } else {
                if (k < 8) {
                    Z[i] = Y[k];
                    k++;
                } else if (j < 10) {
                    Z[i] = X[j];
                    j++;
                }
            }
        }
        for (int i = 0; i < 18; i++) {
            System.out.println(Z[i]);
        }
    }
}