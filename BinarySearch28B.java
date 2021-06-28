import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 1/6/21
 * Program to initialise a sorted array with 10 Strings. Accept a String value from the user
 * and print out the position the String occupies in the array (using binary search)
 */

public class BinarySearch28B {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String a[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        int l = 0, u = a.length - 1;
        int i = -1;
        System.out.print("Enter the String to be searched: ");
        String x = sc.nextLine();
        while (l <= u) {
            int m = (l + u) / 2;
            if (a[m].compareTo(x) > 0) {
                u = m - 1;
            } else if (a[m].compareTo(x) < 0) {
                l = m + 1;
            } else {
                i = m;
                break;
            }
        }
        if (i < 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at position: " + (i + 1));
        }
    }
}