import java.util.*;

/*
 * Program1
 * Kushal Galrani 9H
 * Date: 16/02/21
 * A program to enter 10 numbers into an array and print them out
 */

public class ArrayPrinter1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array created. Printing ...");
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}