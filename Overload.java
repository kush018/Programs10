import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 17/03/21
 * Program that overloads the function volume() such that it can either compute the
 * volume of a cube, a cuboid or a sphere
 */

public class Overload {
    public static double volume(double r) {
        double vol = 4/3.0 * 3.14 * Math.pow(r, 3);
        return vol;
    }
    
    public static double volume(double l, double b, double h) {
        double vol = l * b * h;
        return vol;
    }
    
    public static float volume(float s) {
        float vol = (float) Math.pow(s, 3);
        return vol;
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1) Cube\n2) Sphere\n3) Cuboid\nEnter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter length of side: ");
                float s = sc.nextFloat();
                System.out.println("Volume of cube: " + volume(s));
                break;
            case 2:
                System.out.print("Enter radius of sphere: ");
                double r = sc.nextDouble();
                System.out.println("Volume of sphere: " + volume(r));
                break;
            case 3:
                System.out.print("Enter length of cube: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth of cube: ");
                double b = sc.nextDouble();
                System.out.print("Enter height of cube: ");
                double h = sc.nextDouble();
                System.out.println("Volume of cuboid: " + volume(l, b, h));
                break;
            default:
                System.out.println("Invalid choice entered.");
        }
    }
}