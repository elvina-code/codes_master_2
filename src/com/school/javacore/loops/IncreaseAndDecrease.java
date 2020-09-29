package com.school.javacore.loops;

public class IncreaseAndDecrease {

    public static void main(String[] args){
        int apples = 0;
        int grapes = 10;

        apples += 2; // apples = apples + 2; --> 2
        grapes -= 2; // grapes = grapes - 2; -> 8

        apples++;   //  apples = apples + 1;  --> 3 post increment
        grapes--;   //  grapes = grapes - 1; --> 7

        //System.out.println(apples);
        //System.out.println(grapes);

        // Pre increment and post increment

        System.out.println("apples are :" + apples);
        System.out.println("grapse are :" + grapes);

        System.out.println("apples are pre inc:" + (++apples));
        System.out.println("grapse are pre dec:" + (--grapes));

        System.out.println("apples are :" + apples);
        System.out.println("grapse are :" + grapes);

        System.out.println("apples are post inc:" + (apples++));
        System.out.println("grapse are post dec:" + (grapes--));

        System.out.println("apples are :" + apples);
        System.out.println("grapse are :" + grapes);

        // Post increment and pre increment exercises

        int peaches = 7;
        int bananas = 5;

        int basket = bananas++ + 1;
        System.out.println("bananas "+ bananas + "peaches "+peaches+" basket is "+basket);
        basket = basket + --peaches;
        System.out.println("bananas "+bananas+ "peaches "+ peaches + " basket is "+basket);

        int mathsGrade = 50;
        int physicsGrade = 75;

        int sum = --physicsGrade + mathsGrade++; //74 + 50
        int sum1 = mathsGrade-- + physicsGrade++; //51-- + 74
        int totalSum = sum1 + sum;

        System.out.println("sum: "+sum+"\nsum1 :"+ sum1 +"\nphysicsGrade: "+ physicsGrade+
                "\nmathsGrade: "+ mathsGrade+"\ntotalSum:"+totalSum);
        //75 50

        int x = 5;
        int y = ++x * 5 / x-- + --x;
        System.out.println(y);

    }
}
