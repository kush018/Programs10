import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 27/02/21
 * Program to initialise an array with a set of predefined elements,
 * accept input from the user, search the input in the array (linear
 * search) and print positions of all occurences of the element in
 * the array
 */

public class LinearSearch10 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {6, 2, 3, 4, 1, 7, 8, 5};
        System.out.print("Enter element to be searched: ");
        int n = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                found = true;
                System.out.println("Element " + n + " found at position " + (i+1));
            }
        }
        if (!found) {
            System.out.println("No occurences of element " + n + " in array");
        }
    }
}