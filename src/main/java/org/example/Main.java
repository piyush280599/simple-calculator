package org.example;

import org.example.ui.CalculatorDriver;

// You can run the project either by clicking on run button
// or
// Using terminal, make sure that you open the terminal in the root folder.
// ./gradlew -q --console plain run
public class Main {
    public static void main(String[] args) {
        CalculatorDriver calculatorDriver = new CalculatorDriver();
        calculatorDriver.run();
    }
}