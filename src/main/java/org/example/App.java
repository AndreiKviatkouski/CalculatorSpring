package org.example;

import org.example.service.CalcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) throws InterruptedException{
        ApplicationContext app = new AnnotationConfigApplicationContext("org.example");
        CalcService calcService = (CalcService) app.getBean("calcService");
        calcService.play();
        calcService.repeat();
        calcService.showHistory();

    }
}
