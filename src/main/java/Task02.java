import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author by Anton Shtylenko
 * @see #getValue(String)
 * @see #getOperation()
 * @see #getCalculation(double, double, char)
 * @see  #getArray()
 */

public class Task02 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the program!\n" +
                "Enter the desired work algorithm:\n1 - Mathematical calculator\n" +
                "2 - Searching for an element in an array with the maximum number of characters");
        int choose = scanner.nextInt();
        if (choose == 1) {
            System.out.println("You choose work algorithm 1: Mathematical calculator");
            double val_1 = getValue("Enter first value: ");
            double val_2 = getValue("Enter second value: ");
            char operation = getOperation();
            BigDecimal result = BigDecimal.valueOf(getCalculation(val_1, val_2, operation)).setScale(4, RoundingMode.DOWN);
            System.out.println("Calculated value: " + result);
        } else if (choose == 2) {
            System.out.println("You choose work algorithm 2: Searching for an element in an array with the maximum number of characters");
            String max_word = getArray();
            System.out.println("The word with the maximum number of characters: " + max_word);
        } else {
            System.out.printf("You enter unknown work algorithm: %d. Program will be close.", choose);
        }
    }

    /**
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
     * @param value_1   first entered value
     * @param value_2   second entered value
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

    /**
     *
     * @return the element with the maximum number of characters
     */
    private static String getArray() {
        System.out.println("Enter the number of elements in the array: ");
        int len_array = scanner.nextInt();
        int max_len_element = 0;
        String max_word = null;
        String[] arrays = new String[len_array];
        for (int i = 0; i < arrays.length; i++) {
            System.out.printf("Enter the %d element of the array\n", (i + 1));
            arrays[i] = scanner.next();
            if (max_len_element < arrays[i].length()) {
                max_len_element = arrays[i].length();
                max_word = arrays[i];
            }
        }
        return max_word;
    }
}