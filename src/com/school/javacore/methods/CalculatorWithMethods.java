package com.school.javacore.methods;

import java.util.Scanner;

public class CalculatorWithMethods {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter operator (*, /, +, -)");
        String operator = userInput.next();
        System.out.println("Please enter two numbers: ");
        double firstNumber = userInput.nextDouble();
        double secondNumber = userInput.nextDouble();

        switch (operator){
            case "*":
                multiply(firstNumber, secondNumber);
                break;
            case "/":
                devide(firstNumber, secondNumber);
                break;
            case "-":
                subtract(firstNumber, secondNumber);
                break;
            case "+":
                add(firstNumber, secondNumber);
                break;
            default:
                System.out.println("I can only *, /, -, + two numbers, please try again!");
                break;
        }
    }

    public static void multiply(double num1, double num2) {
        System.out.println("Product of numbers "+num1+" and "+num2 +" = "+(num1 * num2));
    }

    public static void devide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("I can not devide into 0");
        } else {
            System.out.println("The division of "+num1 +" into "+num2 +" = "+ (num1/num2));
        }
    }

    public static void add(double num1, double num2) {
        System.out.println("Sum of numbers "+num1+" and "+num2 +" = "+(num1 + num2));
    }

    public static void subtract(double num1, double num2) {
        System.out.println("Difference of numbers "+num1+" and "+num2 +" = "+(num1 - num2));
    }
}

