import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 31/3/21
 * Program that invokes a function satis() having four arguments a, b, c and d. The function
 * checks whether the equation a cube + b cube + c cube = d cube is satisfied. The function returns
 * 0 if satisfied, else -1
 */

public class SatisChecker24 {
    public static int satis(double a, double b, double c, double d) {
        if (a*a*a + b*b*b + c*c*c == d*d*d) {
            return 0;
        } else {
            return -1;
        }
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a, b, c, d one after another:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        if (satis(a, b, c, d) == 0) {
            System.out.println("The equation is satisfied");
        } else {
            System.out.println("The equation is not satisfied");
        }
    }
}