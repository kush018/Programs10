import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 31/3/21
 * Program to enter name, roll no, and appropriate values as marks
 * for primary, middle school and high school children. Using
 * overloaded functions, calculate and print average and percentage
 * scored by the students
 */

public class AvgCalculator26 {
    public static double avg(double english, double hindi, double math) {
        double average = (english + hindi + math) / 3;
        return average;
    }
    
    public static double avg(double english, double hindi, double math, double sst) {
        double average = (english + hindi + math + sst) / 4;
        return average;
    }
   
    public static double avg(double english, double hindi, double math, double sst, double science) {
        double average = (english + hindi + math + sst + science) / 5;
        return average;
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        String name = sc.nextLine();
        System.out.print("Enter his or her roll number: ");
        int rlno = sc.nextInt();
        System.out.print("Select a category:\n1) Primary School\n2) Middle School\n3) High School\nEnter your choice (1-3): ");
        int choice = sc.nextInt();
        double english, hindi, math, sst, science;
        double average = 0;
        boolean validChoice = true;
        switch (choice) {
            case 1:
                System.out.println("Enter english, hindi and math marks one by one in order");
                english = sc.nextDouble();
                hindi = sc.nextDouble();
                math = sc.nextDouble();
                average = avg(english, hindi, math);
                break;
            case 2:
                System.out.println("Enter english, hindi, math and sst marks one by one in order");
                english = sc.nextDouble();
                hindi = sc.nextDouble();
                math = sc.nextDouble();
                sst = sc.nextDouble();
                average = avg(english, hindi, math, sst);
                break;
            case 3:
                System.out.println("Enter english, hindi, math, sst and science marks one by one in order");
                english = sc.nextDouble();
                hindi = sc.nextDouble();
                math = sc.nextDouble();
                sst = sc.nextDouble();
                science = sc.nextDouble();
                average = avg(english, hindi, math, sst, science);
                break;
            default:
                validChoice = false;
        }
        if (validChoice) {
            System.out.print("Enter total marks for each subject: ");
            double total = sc.nextDouble();
            System.out.println("Results for " + name + " of roll number " + rlno + ":");
            System.out.println("Average: " + average);
            System.out.println("Percentage: " + ((average/total) * 100.0));
        } else {
            System.out.println("Invalid option only options 1 to 3 are valid");
        }
    }
}