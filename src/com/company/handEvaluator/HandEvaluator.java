package com.company.handEvaluator;

import com.company.card.Card;

import java.util.ArrayList;

public abstract class HandEvaluator {
    private HandEvaluator handEvaluator;

    public HandEvaluator linkWith(HandEvaluator handEvaluator){
        this.handEvaluator = handEvaluator;
        return handEvaluator;
    };

    public abstract HandType evaluate(ArrayList<Card> hand);

    protected HandType checkNext(ArrayList<Card> hand) {
        if (handEvaluator == null) {
            return null;
        }
        return handEvaluator.evaluate(hand);
    }
}
