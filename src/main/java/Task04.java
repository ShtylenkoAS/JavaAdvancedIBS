import calculator.ConsoleReader;
import calculator.MathematicalLogic;

public class Task04 {
    static ConsoleReader consoleReader = new ConsoleReader();

    public static void main(String[] args) {

        System.out.println("Enter first value: ");
        double value_1 = consoleReader.numReader();
        System.out.println("Enter second value: ");
        double value_2 = consoleReader.numReader();

        String operation = consoleReader.operationReader();

        MathematicalLogic mathematicalLogic = new MathematicalLogic(value_1, value_2);

        switch (operation) {
            case "+":
                System.out.printf("Calculated value: %.4f", mathematicalLogic.summation());
                break;
            case "-":
                System.out.printf("Calculated value: %.4f", mathematicalLogic.substraction());
                break;
            case "*":
                System.out.printf("Calculated value: %.4f", mathematicalLogic.multiplication());
                break;
            case "/":
                System.out.printf("Calculated value: %.4f", mathematicalLogic.division());
                break;
            default:
                System.out.println("The entered value is not a mathematical operator! Please enter operation again!");
        }
    }
}
