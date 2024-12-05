package calculator.services.impl;

import calculator.services.MultiplicationService;

public class Multiplication implements MultiplicationService {

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
}
