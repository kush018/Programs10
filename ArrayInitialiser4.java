/*
 * Program4
 * Kushal Galrani 10
 * Date: 18/02/21
 * A program to initialise an integer array of five elements
 * and print their sum and average
 */

public class ArrayInitialiser4 {
    public static void main() {
        int[] a = {69, 420, 120, 11, 23};
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum/5.0));
    }
}