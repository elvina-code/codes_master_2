package com.school.javacore.loops;

import java.util.Scanner;

public class WhileUserInput {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        int c = 0;
        while (c < 5) {
            System.out.println("Please enter two numbers: ");
            int start = userInput.nextInt();
            int end = userInput.nextInt();
            int sum = sumOfNumbersInRange(start, end);
            System.out.println("The sum of numbers in range "+ sum);
            c++;
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
