package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService{

    public String hello(){
        return "Добро пожаловать в калькулятор";
    }

}
