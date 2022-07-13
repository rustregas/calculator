package pro.sky.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculateService {

    public int calculatePlus(int num1, int num2){
        return num1+num2;
    }

    public int calculateMinus(int num1, int num2){
        return (num1-num2);
    }

    public int calculateMultiply(int num1, int num2){
        return (num1*num2);
    }

    public float calculateDivide(int num1, int num2) {
        return ((float) num1 / num2);
    }
}
