package com.school.javacore.methods;

import java.util.Random;
import java.util.Scanner;

public class VoidMethods {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.next();
        printName(name);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        addTwoNumbers(num1, num2);

        num1 = input.nextInt();
        num2 = input.nextInt();
        addTwoNumbers(num1, num2);
        addTwoNumbers(1, 8);

        isEvenOrOdd(101);
        isEvenOrOdd(200);
        isEvenOrOdd(333);
        isEvenOrOdd(4444);
        isEvenOrOdd(5111);
        isEvenOrOdd(651);
        isEvenOrOdd(777);
        isEvenOrOdd(80);
        isEvenOrOdd(92);
        isEvenOrOdd(102);
    }

    public static void printName(String name){
        System.out.println("The name is "+name);
    }

    public static void addTwoNumbers(int number1, int number2){
        System.out.println("Sum of "+number1+ " and "+ number2 +" = "+number1+number2);
    }

    public static int addition(int num1, int num2){
        return num1+num2;
    }

    public void printRandomNumber(){
        Random rnd = new Random();
        System.out.println(rnd.nextInt(10));
    }

    public static void isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            String result = number + "is even number";
            printMyString(result);
        } else {
            printMyString(number+ " is odd number");
        }
    }

    public static void printMyString(String text){
        System.out.println(text);
    }
}
