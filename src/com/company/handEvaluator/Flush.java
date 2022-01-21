package com.company.handEvaluator;

import com.company.card.Card;
import com.company.utils.Utils;

import java.util.ArrayList;
import java.util.Collections;

public class Flush extends HandEvaluator{

    @Override
    public HandType evaluate(ArrayList<Card> hand) {
        ArrayList<Integer> suits = Utils.getCardsSuit(hand);
        for (int suit: suits) {
            if (Collections.frequency(suits, suit) == 5) {
                return new HandType("Couleur", 600);
            }
        }
        return checkNext(hand);
    }
}
