package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculateServiceImpl implements CalculateService{

    public String calculatePlus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " + " + num2 + " = " + (num1+num2);
    }

    public String calculateMinus(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " - " + num2 + " = " + (num1-num2);
    }

    public String calculateMultiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1 + " * " + num2 + " = " + (num1*num2);
    }

    public String calculateDivide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if(num2 == 0) {
            return "На ноль нельзя делить";
        } else {
            return num1 + " / " + num2 + " = " + ((float) num1 / num2);
        }
    }
}
