package pro.sky.calculator;

import pro.sky.calculator.exceptions.DivideByZeroException;

public class CalculatorServiceImplConstants {
    public static final int ZERO = 0;
    public static final int MINUS_TEN = -10;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int TEN = 10;

    public static final String Result3 = "1 + 2 = 3";
    public static final String Result1Plus0 = "1 + 0 = 1";
    public static final String ResultNegative9 = "1 + -10 = -9";
    public static final String Result1 = "3 - 2 = 1";
    public static final String Result3Minus0 = "3 - 0 = 3";
    public static final String ResultNegative7 = "3 - 10 = -7";
    public static final String Result5 = "10 / 2 = 5";
    public static final String Result0 = "10 * 0 = 0";
    public static final String Result10Multiply1 = "10 * 1 = 10";
    public static final String Result100 = "10 * -10 = -100";
    public static final String ResultMinus1 = "10 / -10 = -1";
    public static final String ResultException = String.valueOf(new DivideByZeroException("Деление на ноль невозможно!"));


}
