package com.company.card;

public class Card implements Comparable{
    private final Rank rank;
    private final Suit suit;
    private final String name;

    public Card(Rank rank, Suit suit, String name) {
        this.rank = rank;
        this.suit = suit;
        this.name = name;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        int rank = ((Card)o).getRank().getValue();
        return this.rank.getValue()-rank;
    }
}
