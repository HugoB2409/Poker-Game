package com.company.test;

import com.company.card.Card;
import com.company.card.Rank;
import com.company.card.Suit;
import com.company.handEvaluator.FourOfAKind;
import com.company.handEvaluator.HandType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FourOfAKindTest {

    @Test
    public void FourOfAKindTest() {
        ArrayList<Card> hand = new ArrayList<>();
        hand.add(new Card(Rank.ACE, Suit.CLUB, "As Trèfle"));
        hand.add(new Card(Rank.ACE, Suit.DIAMOND, "As Carreau"));
        hand.add(new Card(Rank.ACE, Suit.HEART, "As Cœur"));
        hand.add(new Card(Rank.ACE, Suit.SPADE, "As Pique"));
        hand.add(new Card(Rank.TWO, Suit.SPADE, "2 Pique"));
        hand.add(new Card(Rank.THREE, Suit.SPADE, "3 Pique"));
        hand.add(new Card(Rank.TEN, Suit.SPADE, "10 Pique"));
        HandType handType = new HandType("Carré", 814);
        HandType result = new FourOfAKind().evaluate(hand);
        assertEquals(handType.getName(), result.getName());
        assertEquals(handType.getScore(), result.getScore());
    }

}