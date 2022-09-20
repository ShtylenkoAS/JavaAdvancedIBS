import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author by Anton Shtylenko
 * @see #getValue(String)
 * @see #getOperation()
 * @see #getCalculation(double, double, char)
 */

public class Task01 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double val_1 = getValue("Enter first value: ");
        double val_2 = getValue("Enter second value: ");
        char operation = getOperation();
        BigDecimal result = BigDecimal.valueOf(getCalculation(val_1, val_2, operation)).setScale(4, RoundingMode.DOWN);
        System.out.println("Calculated value: " + result);
    }

    /**
     *
     * @param text how to keep track of number entered
     * @return entered value
     */
    public static double getValue(String text) {
        System.out.println(text);
        double value;
        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        } else {
            System.out.println("The entered value is not a number! Please enter value again!");
            scanner.next();
            value = getValue(text);
        }
        return value;
    }

    /**
     *
     * @return entered mathematics operator
     */
    private static char getOperation() {
        System.out.println("Enter the desired mathematical operation (+, -, *, /): ");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("The entered value is not a mathematical operator! Please enter operation again!");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    /**
     *
     * @param value_1 first entered value
     * @param value_2 second entered value
     * @param operation entered mathematics operator
     * @return calculation result
     */
    private static double getCalculation(double value_1, double value_2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = value_1 + value_2;
                break;
            case '-':
                result = value_1 - value_2;
                break;
            case '*':
                result = value_1 * value_2;
                break;
            case '/':
                result = value_1 / value_2;
                break;
            default:
                System.out.println("The entered value is not a mathematical operator! Please enter operation again!");
                result = getCalculation(value_1, value_2, getOperation());
        }
        return result;
    }
}
