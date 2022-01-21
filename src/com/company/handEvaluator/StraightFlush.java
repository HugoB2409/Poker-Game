package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class StraightFlush extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        Collections.sort(hand);
        ArrayList<Integer> suits = Utils.getCardsSuit(hand);
        int length;

        for (int suit: suits) {
            length = 0;
            if (Collections.frequency(suits, suit) == 5) {
                ArrayList<Integer> cardWithNoDuplicate = Utils.removeDuplicateRank(hand);
                for(int i = 1; i < cardWithNoDuplicate.size() - 1; i++) {
                    if(cardWithNoDuplicate.get(i + 1) - 1 == cardWithNoDuplicate.get(i) && cardWithNoDuplicate.get(i - 1) + 1 == cardWithNoDuplicate.get(i)) {
                        length++;
                    }
                }
                if(length >= 3) {
                    return new HandType("Quinte flush", 900);
                }
            }
        }

        return checkNext(hand);
    }
}
