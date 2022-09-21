package calculator;

import java.util.Scanner;


public class ConsoleReader {
    Scanner scanner = new Scanner(System.in);

    /**
     *
     * @return entered value in console
     */
    public double numReader() {
        double value = 0;
        if (scanner.hasNextDouble()) {
            value = scanner.nextDouble();
        }
        else {
            System.out.println("The entered value is not a number! Please enter value again!");
            scanner.next();
            value = numReader();
        }
        return value;
    }

    /**
     *
     * @return entered mathematics operator in console
     */
    public String operationReader() {
        System.out.println("Enter the desired mathematical operation (+, -, *, /): ");
        String operation = scanner.next();
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            operation = operation;
        } else {
            System.out.println("The entered value is not a mathematical operator! Please enter operation again!");
            scanner.next();
            operation = operationReader();
        }
        return operation;
    }
}
