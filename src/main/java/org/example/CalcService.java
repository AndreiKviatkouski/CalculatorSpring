package org.example;

import java.util.ArrayList;
import java.util.List;

//@Component
public class CalcService {
    //    @Autowired
    private Writer write;
    //    @Autowired
    private Reader read;
    //    @Autowired
    private Calculator calculator;



    public CalcService(Writer write, Reader read, Calculator calculator) {
        this.write = write;
        this.read = read;
        this.calculator = calculator;
    }


    public void play() {
        write.write("Enter operation: sum / minus / multiply / div / exit");
        String operation = read.readString();
        write.write("Enter num1");
        Double num1 = read.readDouble();
        write.write("Enter num2");
        Double num2 = read.readDouble();
        Double result = calculator.calculator(num1, num2, operation);

        write.write("Your result is: " + result);
    }

    public void repeat() {
        write.write("Continue? yes / no");
        String repeat = read.readString();
        if (repeat.equals("yes")){
            play();
        }else {
            write.write("Goodbye!");
            return;
        }


    }public void showHistory() {
        write.write("Show history? yes / no");
        String repeat = read.readString();
        if (repeat.equals("yes")){
            write.write("This function dont work!");
        }else {
            write.write("Bue!");
        }
    }

}
