package pro.sky.calculator.service;

public interface CalculatorService {
    String welcomeToCalculator();
    String functionPlusInCalculator(int firstParam, int secondParam);
    String functionMinusInCalculator(int firstParam, int secondParam);
    String functionMultiplyInCalculator(int firstParam, int secondParam);
    String functionDivideInCalculator(int firstParam, int secondParam);
}
