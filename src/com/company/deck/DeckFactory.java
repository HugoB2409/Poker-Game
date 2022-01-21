package com.company.deck;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;

import java.util.ArrayList;

public class DeckFactory {
    public CardDeck standardDeck() {
        ArrayList<Card> deck = new ArrayList<>();

        deck.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        deck.add(new Card(Rank.TWO, Suit.CLUB, "2 Trèfle"));
        deck.add(new Card(Rank.THREE, Suit.CLUB, "3 Trèfle"));
        deck.add(new Card(Rank.FOUR, Suit.CLUB, "4 Trèfle"));
        deck.add(new Card(Rank.FIVE, Suit.CLUB, "5 Trèfle"));
        deck.add(new Card(Rank.SIX, Suit.CLUB, "6 Trèfle"));
        deck.add(new Card(Rank.SEVEN, Suit.CLUB, "7 Trèfle"));
        deck.add(new Card(Rank.EIGHT, Suit.CLUB, "8 Trèfle"));
        deck.add(new Card(Rank.NINE, Suit.CLUB, "9 Trèfle"));
        deck.add(new Card(Rank.TEN, Suit.CLUB, "10 Trèfle"));
        deck.add(new Card(Rank.JACK, Suit.CLUB, "Valet Trèfle"));
        deck.add(new Card(Rank.QUEEN, Suit.CLUB, "Dame Trèfle"));
        deck.add(new Card(Rank.KING, Suit.CLUB, "Roi Trèfle"));

        deck.add(new Card(Rank.ACE, Suit.DIAMOND, "As Carreau"));
        deck.add(new Card(Rank.TWO, Suit.DIAMOND, "2 Carreau"));
        deck.add(new Card(Rank.THREE, Suit.DIAMOND, "3 Carreau"));
        deck.add(new Card(Rank.FOUR, Suit.DIAMOND, "4 Carreau"));
        deck.add(new Card(Rank.FIVE, Suit.DIAMOND, "5 Carreau"));
        deck.add(new Card(Rank.SIX, Suit.DIAMOND, "6 Carreau"));
        deck.add(new Card(Rank.SEVEN, Suit.DIAMOND, "7 Carreau"));
        deck.add(new Card(Rank.EIGHT, Suit.DIAMOND, "8 Carreau"));
        deck.add(new Card(Rank.NINE, Suit.DIAMOND, "9 Carreau"));
        deck.add(new Card(Rank.TEN, Suit.DIAMOND, "10 Carreau"));
        deck.add(new Card(Rank.JACK, Suit.DIAMOND, "Valet Carreau"));
        deck.add(new Card(Rank.QUEEN, Suit.DIAMOND, "Dame Carreau"));
        deck.add(new Card(Rank.KING, Suit.DIAMOND, "Roi Carreau"));

        deck.add(new Card(Rank.ACE, Suit.HEART, "As Cœur"));
        deck.add(new Card(Rank.TWO, Suit.HEART, "2 Cœur"));
        deck.add(new Card(Rank.THREE, Suit.HEART, "3 Cœur"));
        deck.add(new Card(Rank.FOUR, Suit.HEART, "4 Cœur"));
        deck.add(new Card(Rank.FIVE, Suit.HEART, "5 Cœur"));
        deck.add(new Card(Rank.SIX, Suit.HEART, "6 Cœur"));
        deck.add(new Card(Rank.SEVEN, Suit.HEART, "7 Cœur"));
        deck.add(new Card(Rank.EIGHT, Suit.HEART, "8 Cœur"));
        deck.add(new Card(Rank.NINE, Suit.HEART, "9 Cœur"));
        deck.add(new Card(Rank.TEN, Suit.HEART, "10 Cœur"));
        deck.add(new Card(Rank.JACK, Suit.HEART, "Valet Cœur"));
        deck.add(new Card(Rank.QUEEN, Suit.HEART, "Dame Cœur"));
        deck.add(new Card(Rank.KING, Suit.HEART, "Roi Cœur"));

        deck.add(new Card(Rank.ACE, Suit.SPADE, "As Pique"));
        deck.add(new Card(Rank.TWO, Suit.SPADE, "2 Pique"));
        deck.add(new Card(Rank.THREE, Suit.SPADE, "3 Pique"));
        deck.add(new Card(Rank.FOUR, Suit.SPADE, "4 Pique"));
        deck.add(new Card(Rank.FIVE, Suit.SPADE, "5 Pique"));
        deck.add(new Card(Rank.SIX, Suit.SPADE, "6 Pique"));
        deck.add(new Card(Rank.SEVEN, Suit.SPADE, "7 Pique"));
        deck.add(new Card(Rank.EIGHT, Suit.SPADE, "8 Pique"));
        deck.add(new Card(Rank.NINE, Suit.SPADE, "9 Pique"));
        deck.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        deck.add(new Card(Rank.JACK, Suit.SPADE, "Valet Pique"));
        deck.add(new Card(Rank.QUEEN, Suit.SPADE, "Dame Pique"));
        deck.add(new Card(Rank.KING, Suit.SPADE, "Roi Pique"));

        return new CardDeck(deck);
    }
}
