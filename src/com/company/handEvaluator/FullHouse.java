package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class FullHouse extends HandEvaluator {

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        ArrayList<Integer> cardsValue = Utils.getCardsValue(hand);
        int threeCardValue = 0;
        int twoCardValue = 0;
        for (int value: cardsValue) {
            if (Collections.frequency(cardsValue, value) == 3) {
                threeCardValue = value;
            }
            if (Collections.frequency(cardsValue, value) == 2) {
                twoCardValue = value;
            }
        }
        if(threeCardValue != 0 && twoCardValue != 0) {
            return new HandType("Full house", 700 + threeCardValue + twoCardValue);
        }
        return checkNext(hand);
    }
}
