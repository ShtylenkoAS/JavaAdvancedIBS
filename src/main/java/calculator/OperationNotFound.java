package calculator;

public class OperationNotFound implements Operation{
    private final char operator;
    OperationNotFound(char operator) {
        this.operator = operator;
    }

    /**
     *
     * @param value1 as first value
     * @param value2 as first value
     * @return Exception if entered unsupported mathematical operator
     * @throws Exception if entered unsupported mathematical operator
     */
    @Override
    public double calculateResult(double value1, double value2) throws Exception {
        throw new Exception("Unsupported operation type: " + operator);
    }
}