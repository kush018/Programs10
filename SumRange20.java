import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 9/3/20
 * Program that passes two integer values to a function such that 
 * the first number is smaller than the second number. The integer
 * values will be the range and the function would return the sum 
 * of the numbers in the range
 */

public class SumRange20 {
    public static int calcSum(int x, int y) {
        int s = 0;
        for (int i = x; i <= y; i++) {
            s += i;
        }
        return s;
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("For range:\nEnter number 1: ");
        int x = sc.nextInt();
        System.out.println("Enter number 2: ");
        int y = sc.nextInt();
        int sum = x < y ? calcSum(x, y) : calcSum(y, x);
        System.out.println("The sum of the above entered range is: " + sum);
    }
}