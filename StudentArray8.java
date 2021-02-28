import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 25/02/21
 * A program to enter marks and names of 10 students in two different
 * arrays and print them in a formatted tabular manner
 */

public class StudentArray8 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[10];
        int[] marks = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Name\tMarks");
        for (int i = 0; i < 10; i++) {
            System.out.println(name[i] + "\t" + marks[i]);
        }
    }
}