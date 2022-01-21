package com.company.player;

import com.company.card.Card;
import com.company.handEvaluator.*;

import java.util.ArrayList;

public class Player {
    private final ArrayList<Card> hand = new ArrayList<>();
    private HandType handType;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void clearHand() {
        hand.clear();
    }

    public void evaluateHand(ArrayList<Card> board) {
        ArrayList<Card> card = new ArrayList<>();
        card.addAll(hand);
        card.addAll(board);
        HandEvaluator handEvaluator = new RoyalFlush();
        handEvaluator.linkWith(new StraightFlush())
                    .linkWith(new FourOfAKind())
                    .linkWith(new FullHouse())
                    .linkWith(new Flush())
                    .linkWith(new Straight())
                    .linkWith(new ThreeOfAKind())
                    .linkWith(new TwoPairs())
                    .linkWith(new Pair())
                    .linkWith(new HighCard());

        handType = handEvaluator.evaluate(card);
    }

    public HandType getHandType() {
        return handType;
    }
}
