package com.company.card;

public enum Suit {
    CLUB,
    DIAMOND,
    HEART,
    SPADE;

    public int getValue() {
        return ordinal();
    }
}
