package com.school.javacore.loops;

import java.util.Scanner;

public class LoopBreakContExcs {

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String command="";
        do {
           System.out.println("Enter P, R, S or Q to quit!");
           command = userInput.next();
           if (command.equals("Q")){
               break;
           }
        } while(true);
        System.out.println("Loop has been broken!");


        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
