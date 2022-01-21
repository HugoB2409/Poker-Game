package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.HandType;
import com.company.handEvaluator.Straight;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StraightTest {

    @Test
    public void StraightTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.THREE, Suit.DIAMOND, "Trois Carreau"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        hand.add(new Card(Rank.JACK, Suit.DIAMOND, "Valet Carreau"));
        hand.add(new Card(Rank.QUEEN, Suit.SPADE, "Dame Pique"));
        hand.add(new Card(Rank.KING, Suit.SPADE, "Roi Pique"));
        hand.add(new Card(Rank.ACE, Suit.SPADE, "As Pique"));
        hand.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        HandType handType = new HandType("Quinte", 500);
        HandType result = new Straight().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }
}