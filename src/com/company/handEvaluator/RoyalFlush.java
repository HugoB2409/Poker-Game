package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class RoyalFlush extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        Collections.sort(hand);
        ArrayList<Integer> suits = Utils.getCardsSuit(hand);
        int minValue = 10;

        for (int suit: suits) {
            if (Collections.frequency(suits, suit) == 5) {
                ArrayList<Integer> cardWithNoDuplicate = Utils.removeDuplicateRank(hand);
                for(int i = 0; i < cardWithNoDuplicate.size(); i++) {
                    if(cardWithNoDuplicate.get(i) == minValue) {
                        minValue++;
                    }
                }
                if(minValue == 15) {
                    return new HandType("Quinte Flush Royale", 1000);
                }
            }
        }

        return checkNext(hand);
    }
}