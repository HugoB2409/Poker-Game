package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class ThreeOfAKind extends HandEvaluator {

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        ArrayList<Integer> cardsValue = Utils.getCardsValue(hand);

        for (int value: cardsValue) {
            if (Collections.frequency(cardsValue, value) == 3) {
                return new HandType("Brelan", 400 + value);
            }
        }

        return checkNext(hand);
    }
}
