import java.util.*;

/*
 * Program5
 * Kushal Galrani 9H
 * Date: 18/02/21
 * A program to accept 20 numbers and print only the even 
 * numbers from the array along with their indexs
 */

public class ArrayEven5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 numbers:");
        int[] a = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array created. Printing even numbers ...");
        for (int i = 0; i < 20; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("At index " + i + " even number " + a[i]);
            }
        }
    }
}