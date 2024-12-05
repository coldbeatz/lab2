package calculator.services.impl;

import calculator.services.DivisionService;

public class Division implements DivisionService {

    @Override
    public double divide(double a, double b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return a / b;
    }
}
