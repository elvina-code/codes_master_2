package com.school.javacore.oop;

import java.util.Random;

public class Deck {

    private Card[] cards;

    public Deck(int size) {
        this.cards = new Card[size];

        int index = 0;
        for (int suit = 0; suit < Card.SUITS.length; suit++) {
            for (int rank = 0; rank < Card.RANKS.length; rank++) {
                cards[index] = new Card(suit, rank);
                index++;
            }
        }
    }

    public String toString(){
        String result = ""; // Ace of Diamond
        for (Card card: this.cards) {
            result += card.toString()+"\n";
        }

        return result;
    }

    public void swap(int i, int j) {
        Card temp = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = temp;
    }

    public void shuffle() {
        Random rndGenerator = new Random();
        for (int i = 0 ; i < this.cards.length * 100; i++) {
            int x = rndGenerator.nextInt(this.cards.length);
            int y = rndGenerator.nextInt(this.cards.length);
            swap(x, y);
        }
    }
}
