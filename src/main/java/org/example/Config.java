package org.example;

import org.example.service.CalcService;
import org.example.util.Reader;
import org.example.util.Writer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Writer write() {
        return new Writer();
    }

    @Bean
    public Reader read() {
        return new Reader();
    }

    @Bean
    public Calculator calculator() {
        return new Calculator();

    }@Bean
    public History history() {
        return new History();
    }
    @Bean
    public CalcService calcService() {
        return new CalcService(write(),read(), calculator());
    }
}
