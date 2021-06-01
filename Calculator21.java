import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 17/02/21
 * Menu driven program to add, subtract, multiply and divide two
 * numbers using function, but without return and arguments
 */

public class Calculator21 {
    public static double calculate(double op1, double op2, char operation) {
        return operation == '+' ? op1 + op2 : (operation == '-' ? op1 - op2 : (operation == '*' ? op1 * op2 : (operation == '/' ? op1 / op2 : 0.0)));
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter operand 2: ");
        double op2 = sc.nextDouble();
        System.out.print("Valid operations: +, -, *, /\nEnter operation: ");
        char operation = sc.next().charAt(0);
        System.out.println(operation == '+' || operation == '-' || operation == '*' || operation == '/' ? "The result is: " + calculate(op1, op2, operation) : "Invalid operation entered.");
    }
}