package com.school.javacore.oop;

public class DeckDemo {

    public static void main(String[] args){
        Deck gameDeck = new Deck(56);
        System.out.println(gameDeck);

        gameDeck.shuffle();
        System.out.println(gameDeck);

    }
}
