package com.school.javacore.loops;

public class WhileLoopExcercise {
    public static void main(String[] args){

        int c = 100;
        while (c >= 1){
            isEvenOrOdd(c);
            c = c - 10; //counter = counter + 1
        }

        for (int i = 0; i <=100; i++) {
            isEvenOrOdd(i);
        }

        /*
        int i=0;
        while (i <= 100){
            System.out.println(i);
            i++;
        }
         */

        System.out.println("sum of number from 50 to 103 "+ sumOfNumbersInRange(50, 103));
        System.out.println("sum of number from -10 to -5 "+ sumOfNumbersInRange(-10, -5));
    }

    public static void isEvenOrOdd(int number) {
        if (number % 2 == 0) {
            String result = number + "is even number";
            System.out.println(result);
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static int sumOfNumbersInRange(int start, int end){
        int result = 0;
        int counter = start;
        while (counter <= end) {
            result = result + counter;
            counter++;
        }
        return result;
    }
}
