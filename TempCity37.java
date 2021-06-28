import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 15/6/21
 * Program to enter the names of cities into an array "city". 
 * The highest and lowest temperature recorded in the cities
 * is stored in a two dimensional array "temperature". Display
 * the city corresponding to the highest and lowest temperature
 */

public class TempCity37 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of cities: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] city = new String[n];
        int[][] temperature = new int[2][n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of city: ");
            city[i] = sc.nextLine();
            System.out.print("Enter highest temperature: ");
            temperature[0][i] = sc.nextInt();
            System.out.print("Enter lowest temperature: ");
            temperature[1][i] = sc.nextInt();
            sc.nextLine();
        }
        int h = temperature[0][0], l = temperature[1][0];
        for (int i = 1; i < n; i++) {
            if (temperature[0][i] > h) {
                h = temperature[0][i];
            }
            if (temperature[1][i] < l) {
                l = temperature[1][i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (h == temperature[0][i]) {
                System.out.println(city[i] + " has highest temperature " + temperature[0][i]);
            }
            if (l == temperature[1][i]) {
                System.out.println(city[i] + " has lowest temperature " + temperature[1][i]);
            }
        }
    }
}