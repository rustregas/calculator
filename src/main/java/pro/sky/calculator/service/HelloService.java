package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

}
