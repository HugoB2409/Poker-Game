package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class Straight extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        Collections.sort(hand);
        ArrayList<Integer> cardWithNoDuplicate = Utils.removeDuplicateRank(hand);
        int length = 0;

        for(int i = 1; i < cardWithNoDuplicate.size() - 1; i++) {
            if(cardWithNoDuplicate.get(i + 1) - 1 == cardWithNoDuplicate.get(i) && cardWithNoDuplicate.get(i - 1) + 1 == cardWithNoDuplicate.get(i)) {
                length++;
            }
        }

        if(length >= 3) {
            return new HandType("Quinte", 500);
        }
        return checkNext(hand);
    }
}