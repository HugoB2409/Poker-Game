package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.HandType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlushTest {

    @Test
    public void FlushTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.THREE, Suit.SPADE, "3 Pique"));
        hand.add(new Card(Rank.FOUR, Suit.SPADE, "4 Pique"));
        hand.add(new Card(Rank.FIVE, Suit.SPADE, "5 Pique"));
        hand.add(new Card(Rank.NINE, Suit.SPADE, "9 Pique"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        hand.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        hand.add(new Card(Rank.SEVEN, Suit.CLUB, "7 Carreau"));
        HandType handType = new HandType("Couleur", 600);
        HandType result = new com.company.handEvaluator.Flush().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }

}