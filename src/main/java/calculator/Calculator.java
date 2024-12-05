package calculator;

import calculator.services.*;
import calculator.services.impl.*;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import java.util.Locale;

/**
 * Простий калькулятор
 */
public class Calculator {

    private static final DecimalFormat DECIMAL_FORMAT;

    static {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setGroupingSeparator(' ');
        symbols.setDecimalSeparator('.');

        DECIMAL_FORMAT = new DecimalFormat("###,###.######", symbols);
    }

    private final AdditionService addition             = new Addition();
    private final DivisionService division             = new Division();
    private final MultiplicationService multiplication = new Multiplication();
    private final SubtractionService subtraction       = new Subtraction();
    private final SquareService square                 = new Square();
    private final SquareRootService squareRoot         = new SquareRoot();

    private double value;

    public Calculator plus(double number) {
        value = addition.plus(value, number);
        return this;
    }

    public Calculator divide(double number) {
        value = division.divide(value, number);
        return this;
    }

    public Calculator multiply(double number) {
        value = multiplication.multiply(value, number);
        return this;
    }

    public Calculator minus(double number) {
        value = subtraction.minus(value, number);
        return this;
    }

    public Calculator square() {
        value = square.square(value);
        return this;
    }

    public Calculator squareRoot() {
        value = squareRoot.squareRoot(value);
        return this;
    }

    public void clear() {
        value = 0;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return DECIMAL_FORMAT.format(value);
    }
}
