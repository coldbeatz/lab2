package calculator.services.impl;

import calculator.services.SquareRootService;

public class SquareRoot implements SquareRootService {

    @Override
    public double squareRoot(double a) {
        return Math.sqrt(a);
    }
}
