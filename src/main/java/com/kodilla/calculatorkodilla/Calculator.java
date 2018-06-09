package com.kodilla.calculatorkodilla;

import ch.qos.logback.core.joran.spi.ConsoleTarget;

public class Calculator {

    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }
}

class Application {
    public static void main(String[] agrgs) {
        Calculator calculation = new Calculator();
        System.out.println(calculation.addition(4, 6));
        System.out.println(calculation.subtraction(8, 4));
    }
}


