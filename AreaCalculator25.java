import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 31/03/21
 * Prgoram to overload the function area(). Accept values from the user and print
 * out area of square, rectangle, circle and triangle
 */

public class AreaCalculator25 {
    public static double area(double r) {
        //area of circle
        double area = r * 3.14 * r;
        return area;
    }
    
    public static float area(float s) {
        //area of square
        float area = s * s;
        return area;
    }
    
    public static double area(double l, double b) {
        //area of rectangle
        double area = l * b;
        return area;
    }
    
    public static double area(double a, double b, double c) {
        //area of triangle
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
        return area;
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Square\n2) Circle\n3) Triangle\n4) Rectangle");
        System.out.print("Enter choice (1-4): ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter side: ");
                float s = sc.nextFloat();
                System.out.println("Area: " + area(s));
                break;
            case 2:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area: " + area(r));
                break;
            case 3:
                System.out.print("Enter side 1: ");
                double a = sc.nextDouble();
                System.out.print("Enter side 2: ");
                double b = sc.nextDouble();
                System.out.print("Enter side 3: ");
                double c = sc.nextDouble();
                System.out.println("Area: " + area(a, b, c));
                break;
            case 4:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                b = sc.nextDouble();
                System.out.println("Area: " + area(l, b));
                break;
        }
    }
}