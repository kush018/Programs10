import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 27/02/21
 * Program that enters names of 10 students in an array and asks the
 * user to enter the name to be searched. It locates and prints the
 * student name along with his/her position in the array
 */

public class StudentsArray11 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        System.out.println("Enter names of 10 students:");
        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }
        String toSearch;
        System.out.print("Enter name to be searched: ");
        toSearch = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(toSearch)) {
                found = true;
                System.out.println("Student " + toSearch + " found at position " + (i+1));
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
}