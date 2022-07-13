package pro.sky.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.calculator.service.*;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final HelloService helloService;
    private final CalculateService calculateService;

    public CalculatorController(HelloService helloService, CalculateService calculateService) {
        this.helloService = helloService;
        this.calculateService = calculateService;
    }

    @GetMapping()
    public String hello(){
        return helloService.hello();
    }

    @GetMapping(path = "/plus")
    public String calculatePlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + calculateService.calculatePlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String calculateMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + num2 + " = " + calculateService.calculateMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String calculateMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + num2 + " = " + calculateService.calculateMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String calculateDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
            return num1 + " / " + num2 + " = " + calculateService.calculateDivide(num1, num2);
    }
}
