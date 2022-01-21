package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TwoPairs extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        ArrayList<Integer> cardsValue = Utils.getCardsValue(hand);
        Set<Integer> set = new HashSet();
        int firstPair = 0;
        int secondPair = 0;

        for (int value : cardsValue) {
            if (!set.add(value)) {
                if(firstPair == 0) {
                    firstPair = value;
                } else {
                    secondPair = value;
                }
            }
        }

        if(secondPair != 0) {
            return new HandType("Deux paires", 200 + firstPair + secondPair);
        }

        return checkNext(hand);
    }
}
