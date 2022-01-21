package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.FullHouse;
import com.company.handEvaluator.HandType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FullHouseTest {

    @Test
    public void FullHouseTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        hand.add(new Card(Rank.ACE, Suit.DIAMOND, "As DIAMOND"));
        hand.add(new Card(Rank.ACE, Suit.HEART, "As Cœur"));
        hand.add(new Card(Rank.SEVEN, Suit.SPADE, "7 Pique"));
        hand.add(new Card(Rank.SEVEN, Suit.DIAMOND, "7 DIAMOND"));
        hand.add(new Card(Rank.THREE, Suit.SPADE, "3 Pique"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        HandType handType = new HandType("Full house", 721);
        HandType result = new FullHouse().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }

}