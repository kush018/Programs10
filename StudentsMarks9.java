import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 25/02/21
 * Program to store lists of roll numbers and total marks of 35
 * students of a class. Print the maximum of total marks and the
 * corresponding roll no. of the student who attained it
 */

public class StudentsMarks9 {
    public static void main() {
        int[] roll = new int[35];
        int[] marks = new int[35];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 35; i++) {
            System.out.print("Enter roll no: ");
            roll[i] = sc.nextInt();
            System.out.print("Enter total marks: ");
            marks[i] = sc.nextInt();
        }
        int maxMarksIndex = 0;
        for (int i = 1; i < 35; maxMarksIndex = marks[maxMarksIndex] < marks[i] ? i : maxMarksIndex, i++);
        System.out.println("Student with highest marks:");
        System.out.println("Roll no: " + roll[maxMarksIndex]);
        System.out.println("Marks: " + marks[maxMarksIndex]);
    }
}