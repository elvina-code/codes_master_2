package com.school.javacore.oop;

import java.util.Random;

public class CardDemo {

    public static void main(String[] args){

        Random rnd = new Random();

        Card myCard = new Card(3, 11);

        System.out.println("--" + myCard);

        for (int i = 0; i < 10; i++) {
            Card tempCard = new Card(rnd.nextInt(4), rnd.nextInt(14));
            System.out.println(tempCard);
            System.out.println(myCard.equals(tempCard));
        }
    }
}
