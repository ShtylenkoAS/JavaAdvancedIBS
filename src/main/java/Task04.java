import calculator.MathematicalLogic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author by Anton Shtylenko
 */

public class Task04 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char operation = 0;
        double value1;
        double value2;

        try {
            System.out.println("Enter first value: ");
            value1 = scanner.nextDouble();
            System.out.println("Enter second value: ");
            value2 = scanner.nextDouble();
            System.out.println("Enter the desired mathematical operation (+, -, *, /): ");
            operation = scanner.next().charAt(0);
            MathematicalLogic mathematicalLogic = new MathematicalLogic();
            System.out.println("Calculated value: " + mathematicalLogic.calculation(value1, value2, operation));
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        } catch (ArithmeticException e) {
            System.out.println("This calculator does not support the division by 0 operation");
        } catch (Exception e) {
            System.out.println("Unsupported operation type: " + operation);
        }
    }
}