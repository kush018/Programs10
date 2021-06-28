import java.util.*;

/*
 * Kushal Galrani 10H
 * Date: 22/6/21
 * Program to enter marks obtained by 10 students in 3 subjects using
 * 2D array and calculate the grades for each student based on average 
 * marks based on given criteria
 */

public class AvgCalc38 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[10][3];
        System.out.println("Enter marks of students as directed: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks scored by student " + (i + 1) + " in 3 subjects one after another:");
            marks[i][0] = sc.nextInt();
            marks[i][1] = sc.nextInt();
            marks[i][2] = sc.nextInt();
        }
        System.out.println("Student\tGrade");
        for (int i = 0; i < marks.length; i++) {
            double avg = (marks[i][0] + marks[i][1] + marks[i][0]) / 3.0;
            char grade = 'D';
            if (avg > 45) {
                grade = 'C';
            }
            if (avg > 60) {
                grade = 'B';
            }
            if (avg > 75) {
                grade = 'A';
            }
            System.out.println(i + "\t" + grade);
        }
    }
}