package org.knit.lab9;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards = new ArrayList<>();

    public Deck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void displayDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
