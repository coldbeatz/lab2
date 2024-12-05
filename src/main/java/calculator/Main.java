package calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.plus(10).plus(30).minus(5).multiply(2);
        System.out.println(calculator.getValue());

        calculator.divide(35);
        System.out.println(calculator);

        calculator.square();
        System.out.println(calculator);

        calculator.clear();
        calculator.plus(10).divide(3.52).multiply(333333);
        System.out.println(calculator);
    }
}

