package com.school.javacore.loops;

public class LoopsExc1 {

    public static void main(String[] args){
        //printMultTable(8);

        //long powerofNum = power(2,5);
        //System.out.println(powerofNum);
        String word = "devxschool";
        StringBuilder reverseWordBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWordBuilder.append(word.charAt(i));
        }
        System.out.println(reverseWordBuilder.toString());
    }

    public static void printMultTable(int number) {
        for (int i = 0; i <= 10; i++){
            System.out.println(number + " x " + i +" = " + (number * i));
        }
    }

    public static long power(long number, int p){
        long result = 1;
        for (int i = 1; i <= p; i++){
            result = result * number;
        }
        return result;
    }


}