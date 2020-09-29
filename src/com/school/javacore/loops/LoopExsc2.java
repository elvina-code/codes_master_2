package com.school.javacore.loops;

import java.util.Scanner;

public class LoopExsc2 {

    public static void main(String[] args){
       Scanner userInput = new Scanner(System.in);
       boolean isValidInput = false;
       int a;
       do {
           System.out.println("Please enter Integer to continue, enter anything else to exit!");
           if (userInput.hasNextInt()) {
               isValidInput = true;
               a = userInput.nextInt();
               System.out.println("You got another chance!");
           }else {
               isValidInput = false;
               System.out.println("No another chance, sorry!");
           }
       } while(isValidInput);


        int sum = 0;
        for(int i = 1; i < 10; i++){
            if(isEven(i)){
                System.out.println(i);
                sum += i;
            }else{
                System.out.println("odd");
            }
        }
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
}
