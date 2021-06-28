/*
 * Kushal Galrani 10H
 * Date: 5/6/21
 * Program to initialise an array with 5 numeric elements and 
 * print the array in ascending order using selection sort
 */
public class SelectionSort29 {
    public static void main() {
        int a[] = {420, 69, 69420, 3, 1};
        for (int i = 0; i < a.length - 1; i++) {
            int p = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[p] > a[j]) {
                    p = j;
                }
            }
            int tmp = a[p];
            a[p] = a[i];
            a[i] = tmp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}