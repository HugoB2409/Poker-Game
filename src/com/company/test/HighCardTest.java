package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.HandType;
import com.company.handEvaluator.HighCard;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HighCardTest {

    @Test
    public void HighCardTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        hand.add(new Card(Rank.NINE, Suit.DIAMOND, "9 DIAMOND"));
        hand.add(new Card(Rank.TWO, Suit.HEART, "2 Cœur"));
        hand.add(new Card(Rank.SEVEN, Suit.SPADE, "7 Pique"));
        hand.add(new Card(Rank.SIX, Suit.DIAMOND, "6 DIAMOND"));
        hand.add(new Card(Rank.THREE, Suit.SPADE, "3 Pique"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        HandType handType = new HandType("Carte la plus haute", 14);
        HandType result = new HighCard().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }

}