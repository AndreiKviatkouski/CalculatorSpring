package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Calculator {
    public double calculator(double a, double b, String operation) {
        double result = 0;
        switch (operation) {
            case ("sum"):
                result = sum(a, b);
                break;
            case ("minus"):
                result = minus(a, b);
                break;
            case ("div"):
                result = div(a, b);
                break;
            case ("multiply"):
                result = multiply(a, b);
                break;
        }
        return result;
    }

    private  double sum(double a, double b) {
        return a + b;
    }

    private  double minus(double a, double b) {
        return a - b;
    }

    private  double div(double a, double b) {
        return a / b;
    }

    private  double multiply(double a, double b) {
        return a * b;
    }
}


