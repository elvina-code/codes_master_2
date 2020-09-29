package com.school.javacore.methods;

import java.util.Scanner;

public class ValueMethods {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();
        double squaredNumber = square(number);
        System.out.println("The square of "+number+" is "+squaredNumber);
    }

    public static double square(int a){
        double result = a * a;

        return result;
    }

}
