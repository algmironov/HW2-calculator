package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping(path= "/calculator")
    public String welcomeToCalculator() {
        return calculatorService.welcomeToCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String functionPlusInCalculator(@RequestParam("num1") int firstParam, @RequestParam("num2") int secondParam) {
        return calculatorService.functionPlusInCalculator(firstParam, secondParam);
    }

    @GetMapping(path = "/calculator/minus")
    public String functionMinusInCalculator(@RequestParam("num1") int firstParam, @RequestParam("num2") int secondParam) {
        return calculatorService.functionMinusInCalculator(firstParam, secondParam);
    }

    @GetMapping(path = "/calculator/multiply")
    public String functionMultiplyInCalculator(@RequestParam("num1") int firstParam, @RequestParam("num2") int secondParam) {
        return calculatorService.functionMultiplyInCalculator(firstParam, secondParam);
    }

    @GetMapping(path = "/calculator/divide")
    public String functionDivideInCalculator(@RequestParam("num1") int firstParam, @RequestParam("num2") int secondParam) {
        return calculatorService.functionDivideInCalculator(firstParam, secondParam);
    }
}
