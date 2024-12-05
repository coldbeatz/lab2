package calculator.services.impl;

import calculator.services.AdditionService;

public class Addition implements AdditionService {

    @Override
    public double plus(double a, double b) {
        return a + b;
    }
}
