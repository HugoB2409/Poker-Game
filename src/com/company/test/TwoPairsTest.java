package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.HandType;
import com.company.handEvaluator.TwoPairs;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoPairsTest {

    @Test
    public void TwoPairsTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        hand.add(new Card(Rank.ACE, Suit.DIAMOND, "As Carreau"));
        hand.add(new Card(Rank.FOUR, Suit.HEART, "4 Cœur"));
        hand.add(new Card(Rank.FOUR, Suit.SPADE, "4 Pique"));
        hand.add(new Card(Rank.TWO, Suit.SPADE, "2 Pique"));
        hand.add(new Card(Rank.THREE, Suit.SPADE, "3 Pique"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        HandType handType = new HandType("Deux paires", 218);
        HandType result = new TwoPairs().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }

}

