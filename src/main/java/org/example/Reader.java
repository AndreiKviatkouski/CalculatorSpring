package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//@Component
public class Reader {


    public String readLine() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        if (line.isEmpty()) {
            Writer.write("Was entered empty string,try again!");
            return null;
        }
        return line;
    }


    public String readWithInvite(String invite) {
        Writer.write(invite);
        return readLine();
    }


    public double readDouble() {
        while (true) {
            try {
                double number = Double.parseDouble(readWithInvite(""));
                if (number == 0) throw new NullPointerException();
                return number;
            } catch (NullPointerException | NumberFormatException e) {
                Writer.write("Number incorrect! Try again!");
            }
        }
    }


    public String readString() {
        List<String> list = Arrays.asList("sum", "div", "multiply", "minus", "yes", "no", "exit");
        String operation = readLine();
        while (true) {
            try {
                if (!list.contains(operation))
                    throw new NullPointerException();
                return operation;

            } catch (NullPointerException e) {
                Writer.write("Was entered incorrect operation, try again!");

            }

        }
    }
}
