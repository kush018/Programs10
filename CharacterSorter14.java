import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 3/3/21
 * Program to enter 10 characters into a character array and sort
 * it using bubble sort in ascending order and print them
 */

public class CharacterSorter14 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a character: ");
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Sorting ...");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}