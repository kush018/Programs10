import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 4/3/21
 * Program using menu to add, subtract, multiply and divide two
 * numbers entered by the user (using functions; functions should 
 * not have arguments but should have return)
 */

public class Calculator17 {
    public static String calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter operand 2: ");
        double op2 = sc.nextDouble();
        System.out.println("Operations: +, -, *, /");
        System.out.print("Enter required operation: ");
        char operation = sc.next().charAt(0);
        String result;
        switch (operation) {
            case '+':
                result = "The result is: " + (op1 + op2);
                break;
            case '-':
                result = "The result is: " + (op1 - op2);
                break;
            case '*':
                result = "The result is: " + (op1 * op2);
                break;
            case '/':
                result = "The result is: " + (op1 / op2);
                break;
            default:
                result = "Invalid choice entered. Aborting ...";
        }
        return result;
    }
    
    public static void main() {
        String result = Calculator17.calculate();
        System.out.println(result);
    }
}