package com.school.javacore.fundamentals;

public class Arithmetcs {

    public static void main(String[] args){
        int number1 = 11, number2 = 22;
        double cents = 0.1, exampleDouble = 0.3;

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int fraction = number1 / number2;
        int remainder = number1 % 3;

       int combination = number1 + sum - difference * product / fraction % remainder;

        long x = 5;
        long y = (x = 6);

        System.out.println("I am X " + x);
        System.out.println("I am Y " + y);
        System.out.println(number1 + " + " + number2 + " = " + sum);
        System.out.println(number1 + " - " + number2 + " = " + difference);
        System.out.println(number1 + " * " + number2 + " = " + product);
        System.out.println(number1 + " / " + number2 + " = " + fraction);
        System.out.println(number1 + " % " + 3 + " = " + remainder);

        sum += 10; // sum = sum + 10;
        sum -= 10; // sum = sum - 10;
        sum *= 10; // sum = sum * 10;
        sum /= 10; // sum = sum / 10;

        String cup1 = "cola";
        String cup2 = "fanta";

        System.out.println("In cup1 I have "+ cup1);
        System.out.println("In cup2 I have "+ cup2);

        String empty = cup2;
        cup2 = cup1;
        cup1 = empty;

        System.out.println("In cup1 I have "+ cup1);
        System.out.println("In cup2 I have "+ cup2);

        int numberInteger = 10;
        double numberDouble = 2.3;

        byte num1 = 77;
        byte num2 = 99;

        int result = num1 + num2;

        System.out.println("The result form byte "+result);
        System.out.println(numberInteger + numberDouble);

        System.out.println(10L + 10.1f);
    }
}
