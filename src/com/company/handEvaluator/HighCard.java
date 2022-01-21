package com.company.handEvaluator;

import com.company.card.Card;

import java.util.ArrayList;

public class HighCard extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        int highestValue = 0;
        for(Card card: hand) {
            if(card.getRank().getValue() > highestValue) {
                highestValue = card.getRank().getValue();
            }
        }

        return new HandType("Carte la plus haute", highestValue);
    }
}
