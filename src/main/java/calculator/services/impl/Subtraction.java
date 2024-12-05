package calculator.services.impl;

import calculator.services.SubtractionService;

public class Subtraction implements SubtractionService {

    @Override
    public double minus(double a, double b) {
        return a - b;
    }
}
