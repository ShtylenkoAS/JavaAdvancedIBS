package calculator;

public class MathematicalLogic {
    private double value1;
    private double value2;

    public MathematicalLogic(double value_1, double value_2) {
       this.value1 = value_1;
       this.value2 = value_2;
    }

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public double summation() {
        return value1 + value2;
    }

    public double substraction() {
        return  value1 - value2;
    }

    public double multiplication() {
        return  value1 * value2;
    }

    public double division() {
        return value1 / value2;
    }
}
