package pro.sky.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.CalculatorServiceImplConstants.*;

public class CalculatorServiceImplParametrizedTest {

    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    private static Stream<Arguments> argumentsForTestingPlusFunctionOfCalculator() {
        return Stream.of(
                Arguments.of(ONE,TWO,Result3),
                Arguments.of(ONE,ZERO,Result1Plus0),
                Arguments.of(ONE,MINUS_TEN,ResultNegative9)

        );
    }

    @MethodSource("argumentsForTestingPlusFunctionOfCalculator")
    @ParameterizedTest
    public void testingCorrectReturnOfPlusFunction(int num1, int num2, String result) {
        assertEquals(result, out.functionPlusInCalculator(num1, num2));
    }

    private static Stream<Arguments> argumentsForTestingMinusFunctionOfCalculator() {
        return Stream.of(
                Arguments.of(THREE,TWO,Result1),
                Arguments.of(THREE,TEN,ResultNegative7),
                Arguments.of(THREE,ZERO,Result3Minus0)

        );
    }

    @MethodSource("argumentsForTestingMinusFunctionOfCalculator")
    @ParameterizedTest
    public void testingCorrectReturnOfMinusFunction(int num1, int num2, String result) {
        assertEquals(result, out.functionMinusInCalculator(num1, num2));
    }

    private static Stream<Arguments> argumentsForTestingMultiplyFunctionOfCalculator() {
        return Stream.of(
                Arguments.of(TEN,ONE,Result10Multiply1),
                Arguments.of(TEN,ZERO,Result0),
                Arguments.of(TEN,MINUS_TEN,Result100)

        );
    }

    @MethodSource("argumentsForTestingMultiplyFunctionOfCalculator")
    @ParameterizedTest
    public void testingCorrectReturnOfMultiplyFunction(int num1, int num2, String result) {
        assertEquals(result, out.functionMultiplyInCalculator(num1, num2));
    }

    private static Stream<Arguments> argumentsForTestingDivideFunctionOfCalculator() {
        return Stream.of(
                Arguments.of(TEN,TWO,Result5),
                Arguments.of(TEN,MINUS_TEN,ResultMinus1)

        );
    }

    @MethodSource("argumentsForTestingDivideFunctionOfCalculator")
    @ParameterizedTest
    public void testingCorrectReturnOfDivideFunction(int num1, int num2, String result) {
        assertEquals(result, out.functionDivideInCalculator(num1, num2));
    }
}
