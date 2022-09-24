package calculator;

import java.util.HashMap;
import java.util.Map;

public class MathematicalLogic {
    private final Map<Character, Operation> operationMap = new HashMap<>();

    public MathematicalLogic() {
        operationMap.put('+', new Summation());
        operationMap.put('-', new Substraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    /**
     *
     * @param value1 as first value
     * @param value2 as second value
     * @param operation as mathematical operator
     * @return calculate result
     * @throws Exception if exists
     */
    public double calculation(double value1, double value2, char operation) throws Exception {
        Operation operationMapValue = operationMap.getOrDefault(operation, new OperationNotFound(operation));
        return operationMapValue.calculateResult(value1, value2);
    }
}