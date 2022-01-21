package com.company.deck;


import com.company.card.Card;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {
    private final ArrayList<Card> deck;

    public CardDeck(ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public void burnCard() {
        deck.remove(deck.size() - 1);
    }

    public Card getCard() {
        Card card = deck.get(deck.size() - 1);
        deck.remove(deck.size() - 1);
        return card;
    }
}
