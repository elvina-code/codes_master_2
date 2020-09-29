package com.school.javacore.methods;

public class VoidMethods1 {

    public static void main(String[] args){

        int num1 = 9;
        System.out.println("I am before incrementing: "+num1);
        incrementNum(num1);
        System.out.println("I am after incrementing: "+num1);
    }

    public static void incrementNum(int a){
        System.out.println("I am increment method!");
        a = a + 1;
        System.out.println("I am a , and my values is "+a);
    }
}
