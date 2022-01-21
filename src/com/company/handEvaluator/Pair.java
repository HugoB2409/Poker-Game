package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pair extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        Set<Integer> set = new HashSet();
        for (int value : Utils.getCardsValue(hand)) {
            if (!set.add(value)) {
                return new HandType("Une paire", 100 + value);
            }
        }

        return checkNext(hand);
    }
}
