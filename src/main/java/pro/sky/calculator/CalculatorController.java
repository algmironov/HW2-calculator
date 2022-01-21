package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping
    public String welcomeToCalculator() {
        return calculatorService.welcomeToCalculator();
    }

    @GetMapping(path = "/plus")
    public String functionPlusInCalculator(@RequestParam(value = "num1", required = true) int firstParam,
                                           @RequestParam(value = "num2", required = true) int secondParam) {
        return calculatorService.functionPlusInCalculator(firstParam, secondParam);
    }

    @GetMapping(path = "/minus")
    public String functionMinusInCalculator(@RequestParam(value = "num1", required = true) int firstParam,
                                            @RequestParam(value = "num2", required = true) int secondParam) {
        return calculatorService.functionMinusInCalculator(firstParam, secondParam);
    }

    @GetMapping(path = "/multiply")
    public String functionMultiplyInCalculator(@RequestParam(value = "num1", required = true) int firstParam,
                                               @RequestParam(value = "num2", required = true) int secondParam) {
        return calculatorService.functionMultiplyInCalculator(firstParam, secondParam);
    }

    @GetMapping(path = "/divide")
    public String functionDivideInCalculator(@RequestParam(value = "num1", required = true) int firstParam,
                                             @RequestParam(value = "num2", required = true) int secondParam) {
        return calculatorService.functionDivideInCalculator(firstParam, secondParam);
    }
}
