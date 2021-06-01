import java.util.*;

/*
 * Kushal Galrani 10
 * Date: 9/3/21
 * Menu Driven Program that can add, subtract, multiply, divide two numbers
 * (using functions; without return; with parameters)
 */

public class Calculator19 {
    public static void calculate(double x, double y, char operation) {
        String result = "The result is: ";
        switch (operation) {
            case '+':
                result += (x + y); break;
            case '-':
                result += (x - y); break;
            case '*':
                result += (x * y); break;
            case '/':
                result += (x / y); break;
            default:
                result = "Invalid operation entered";
        }
        System.out.println(result);
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operand 1: ");
        double op1 = sc.nextDouble();
        System.out.print("Enter operand 2: ");
        double op2 = sc.nextDouble();
        System.out.print("Operations: +, -, *, /\nEnter operations: ");
        char operation = sc.next().charAt(0);
        calculate(op1, op2, operation);
    }
}