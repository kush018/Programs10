import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 1/6/21
 * Program to initialise an array of 10 integer elements and to input an element to be
 * searched by binary search and print the position of the element if found, and to
 * display an error message if not found
 */

public class BinarySearch28 {
    public static void main() { 
        Scanner sc = new Scanner(System.in);
        int a[] = {1, 2, 3, 4, 5, 69, 420, 421, 69420, 69421};
        System.out.print("Enter element to be searched: ");
        int x = sc.nextInt();
        int l = 0, u = a.length - 1;
        int i = -1;
        while (l <= u) {
            int m = (l + u) / 2;
            if (a[m] > x) {
                u = m - 1;
            } else if (a[m] < x) {
                l = m + 1;
            } else {
                i = m;
                break;
            }
        }
        if (i < 0) {
            System.out.println("Unable to find element");
        } else {
            System.out.println("Element found at position: " + (i + 1));
        }
    }
}