package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String welcomeToCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    public String functionPlusInCalculator(int firstParam, int secondParam) {
//        if (firstParam == null || secondParam == null)
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
            return "Деление на ноль невозможно!";
        }else {
            int result = firstParam / secondParam;
            return firstParam + " / " + secondParam + " = " + result;
        }
    }
}
