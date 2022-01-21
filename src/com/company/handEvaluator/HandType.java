package com.company.handEvaluator;

public class HandType {
    private final String name;
    private final int score;

    public HandType(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}
