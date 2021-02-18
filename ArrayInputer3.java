import java.util.*;

/*
 * Program3
 * Kushal Galrani 9H
 * Date: 16/02/21
 * A program that inputs 10 numbers, stores them in an array and
 * prints the values of those elements whose subscripts are odd
 */

public class ArrayInputer3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array created. Printing elements...");
        for (int i = 1; i < 10; i += 2) {
            System.out.println(a[i]);
        }
    }
}