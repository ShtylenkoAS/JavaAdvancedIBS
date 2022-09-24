package calculator;

public class Summation implements Operation {

    /**
     *
     * @param value1 as first value
     * @param value2 as second value
     * @return calculated value
     */
    @Override
    public double calculateResult(double value1, double value2) {
        return value1 + value2;
    }
}