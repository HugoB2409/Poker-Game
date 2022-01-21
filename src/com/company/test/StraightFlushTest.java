package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.HandType;
import com.company.handEvaluator.StraightFlush;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StraightFlushTest {

    @Test
    public void StraightFlushTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.NINE, Suit.SPADE, "9 Pique"));
        hand.add(new Card(Rank.NINE, Suit.DIAMOND, "9 Carreau"));
        hand.add(new Card(Rank.TEN, Suit.DIAMOND, "10 Carreau"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        hand.add(new Card(Rank.JACK, Suit.SPADE, "Valet Pique"));
        hand.add(new Card(Rank.QUEEN, Suit.SPADE, "Dame Pique"));
        hand.add(new Card(Rank.KING, Suit.SPADE, "Roi Pique"));
        HandType handType = new HandType("Quinte flush", 900);
        HandType result = new StraightFlush().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }
}