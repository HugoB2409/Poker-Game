package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.HandType;
import com.company.handEvaluator.RoyalFlush;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RoyalFlushTest {

    @Test
    public void RoyalFlushTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.FIVE, Suit.CLUB, "5 Trèfle"));
        hand.add(new Card(Rank.TEN, Suit.DIAMOND, "10 Carreau"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        hand.add(new Card(Rank.JACK, Suit.SPADE, "Valet Pique"));
        hand.add(new Card(Rank.QUEEN, Suit.SPADE, "Dame Pique"));
        hand.add(new Card(Rank.KING, Suit.SPADE, "Roi Pique"));
        hand.add(new Card(Rank.ACE, Suit.SPADE, "As Pique"));
        HandType handType = new HandType("Quinte Flush Royale", 1000);
        HandType result = new RoyalFlush().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }

}