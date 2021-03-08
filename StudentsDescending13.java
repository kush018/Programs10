import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 2/3/21
 * Program to input marks of 7 students into an array and sort it
 * in descending order and print it
 */

public class StudentsDescending13 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[7];
        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            marks[i-1] = sc.nextInt();
        }
        System.out.println("Sorting ...");
        for (int i = 0; i < marks.length - 1; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] < marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}