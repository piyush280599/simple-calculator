package org.example.ui;

import org.example.service.Calculator;

import java.util.Scanner;

public class CalculatorDriver {

    private final Scanner scanner = new Scanner(System.in);
    private final Calculator calculator = new Calculator();

    public void run() {
        performAddition();
    }

    private void performAddition() {
        System.out.println("Addition");

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int result = calculator.add(num1, num2);
        System.out.println("Sum: " + result);
    }
}
