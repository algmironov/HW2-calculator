package pro.sky.calculator.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.calculator.exceptions.DivideByZeroException;
import pro.sky.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String functionPlusInCalculator(int firstParam, int secondParam) {
        int result = firstParam + secondParam;
        return firstParam + " + " + secondParam + " = " + result;
    }

    public String functionMinusInCalculator(int firstParam, int secondParam) {
        int result = firstParam - secondParam;
        return firstParam + " - " + secondParam + " = " + result;
    }

    public String functionMultiplyInCalculator(int firstParam, int secondParam) {
        int result = firstParam * secondParam;
        return firstParam + " * " + secondParam + " = " + result;
    }

    public String functionDivideInCalculator(int firstParam, int secondParam) {
        if (secondParam == 0) {
            throw new DivideByZeroException("Деление на ноль невозможно!");
        }else {
            int result = firstParam / secondParam;
            return firstParam + " / " + secondParam + " = " + result;
        }
    }
}
