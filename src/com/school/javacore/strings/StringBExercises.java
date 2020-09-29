package com.school.javacore.strings;

import java.util.Scanner;

public class StringBExercises {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        StringBuilder stb = new StringBuilder();
        stb.append("Monday");
        stb.append("Tuesday");
        stb.insert(6,'-');
        stb.delete(3, 6);
        stb.reverse();
        System.out.println(stb);

        System.out.println(convertFirstToUpper("mirgul"));
        convertAndPrintTwoWords("will", "smith");

        //////////////////////////////

        System.out.println("Guess a word!");
        String word = userInput.next();
        boolean isPalindromeResult = isPalindrome(word);

        if (isPalindromeResult) {
            System.out.println("It is Palindrome!");
        } else {
            System.out.println("Sorry, it is not a palindrome!");
        }


    }

    public static boolean isPalindrome(String inputString){
        StringBuilder stb = new StringBuilder(inputString);
        return stb.reverse().toString().equals(inputString);
    }

    public static void convertAndPrintTwoWords(String s1, String s2){
        System.out.println(convertFirstToUpper(s1)+ " "+convertFirstToUpper(s2));
    }

    public static String convertFirstToUpper(String s){

        String firstLetter = s.substring(0,1).toUpperCase();
        String result = firstLetter.concat(s.substring(1, s.length())); // firstLetter + s.substring()
        return result;
    }
}
