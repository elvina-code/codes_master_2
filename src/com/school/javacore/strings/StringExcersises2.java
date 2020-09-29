package com.school.javacore.strings;

public class StringExcersises2 {

    public static void main(String[] args){
        String sunday = "Sunday";
        String monday = "Monday";
        sunday = "tuesday";

        String s4 =sunday.concat("Sunday").toUpperCase(); //SundaySunday --> SUNDAYSUNDAY
        System.out.println(sunday);
        System.out.println(s4);
        //String s3 = "Sunday";
        System.out.println("half is : "+halfIt("Java is an island!")+" other haf is "+otherHalf("Java is an island!"));
        System.out.println(halfIt("Wednesday"));
    }

    public static String halfIt(String stringInput) {
        return stringInput.substring(0, stringInput.length()/2);
    }

    public static String otherHalf(String stringInput){
        return stringInput.substring(stringInput.length()/2, stringInput.length());
    }
}
