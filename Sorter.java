import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 7/3/21
 * Program that inputs n (n is entered by the user) double values
 * and sorts them in ascending order and prints them
 */

public class Sorter {
    public static void sort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    sorted = false;
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
            if (sorted) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        System.out.println("Sorting elements in ascending order ... ");
        sort(arr);
        System.out.println("Sorting process complete. Printing sorted elements ... ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Done");
    }
}