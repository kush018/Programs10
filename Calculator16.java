import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 4/3/21
 * Program using menu to add, subtract, multiply and divide two
 * numbers entered by the user (using functions; functions may not
 * have arguments/return)
 */

public class Calculator16 {
    public static void calc() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter operand 2: ");
        double op2 = sc.nextDouble();
        System.out.println("Operations: +, -, *, /");
        System.out.print("Enter required operation: ");
        char operation = sc.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("The result is: " + (op1 + op2));
                break;
            case '-':
                System.out.println("The result is: " + (op1 - op2));
                break;
            case '*':
                System.out.println("The result is: " + (op1 * op2));
                break;
            case '/':
                System.out.println("The result is: " + (op1 / op2));
                break;
            default:
                System.out.println("Invalid choice entered. Aborting ...");
        }
    }
    
    public static void main() {
        Calculator16.calc();
    }
}