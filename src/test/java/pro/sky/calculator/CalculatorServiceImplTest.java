package pro.sky.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exceptions.DivideByZeroException;
import pro.sky.calculator.service.impl.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.CalculatorServiceImplConstants.*;

public class CalculatorServiceImplTest {

    private CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void testing1Plus2ShouldReturn3() {
        assertEquals(Result3,out.functionPlusInCalculator(ONE,TWO));
    }

    @Test
    public void testing1Plus0ShouldReturn1() {
        assertEquals(Result1Plus0,out.functionPlusInCalculator(ONE,ZERO));
    }

    @Test
    public void testing1PlusMinus10ShouldReturnMinus9() {
        assertEquals(ResultNegative9,out.functionPlusInCalculator(ONE,MINUS_TEN));
    }

    @Test
    public void testing3Minus2ShouldReturn1() {
        assertEquals(Result1,out.functionMinusInCalculator(THREE,TWO));
    }

    @Test
    public void testing3Minus10ShouldReturnMinus7() {
        assertEquals(ResultNegative7,out.functionMinusInCalculator(THREE,TEN));
    }

    @Test
    public void testing3Minus0ShouldReturn3() {
        assertEquals(Result3Minus0,out.functionMinusInCalculator(THREE,ZERO));
    }


    @Test
    public void testing10Multiply0ShouldReturn0() {
        assertEquals(Result0,out.functionMultiplyInCalculator(TEN,ZERO));
    }

    @Test
    public void testing10Multiply1ShouldReturn10() {
        assertEquals(Result10Multiply1,out.functionMultiplyInCalculator(TEN,ONE));
    }

    @Test
    public void testing10MultiplyMinus10ShouldReturnMinus100() {
        assertEquals(Result100,out.functionMultiplyInCalculator(TEN,MINUS_TEN));
    }

    @Test
    public void testing10DivideMinus10ShouldReturnMinus1() {
        assertEquals(ResultMinus1,out.functionDivideInCalculator(TEN,MINUS_TEN));
    }

    @Test
    public void testing10Divide0ShouldReturnException() {
        assertThrows(DivideByZeroException.class, () -> out.functionDivideInCalculator(TEN,ZERO));
    }


}
