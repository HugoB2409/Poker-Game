package com.company.utils;

import com.company.card.Card;
import com.company.player.Player;

import java.util.*;

public class Utils {
    public static int readIntInBetween(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Veuillez entrer un chiffre.");
                scanner.next();
            }
            input = scanner.nextInt();

            if (input < min || input > max) {
                System.out.println("La valeur entré n'est pas valide.");
            }
        } while (input < min || input > max);
        return input;
    }

    public static ArrayList<Integer> getCardsValue(ArrayList<Card> hand) {
        ArrayList<Integer> cardValue = new ArrayList<>();
        for(Card card: hand) {
            cardValue.add(card.getRank().getValue());
        }
        return cardValue;
    }

    public static ArrayList<Integer> getCardsSuit(ArrayList<Card> hand) {
        ArrayList<Integer> cardSuit = new ArrayList<>();
        for(Card card: hand) {
            cardSuit.add(card.getSuit().getValue());
        }
        return cardSuit;
    }

    public static ArrayList<Integer> removeDuplicateRank(ArrayList<Card> hand) {
        ArrayList<Integer> temp = new ArrayList<>();

        Set<Integer> set = new HashSet();
        for (int value : Utils.getCardsValue(hand)) {
            if (set.add(value)) {
                temp.add(value);
            }
        }

        return temp;
    }
    
    public static Player getHighestScore(ArrayList<Player> players) {
        int maxScore = 0;
        Player highestScore = null;
        for(Player player: players) {
            if(player.getHandType().getScore() > maxScore) {
                highestScore = player;
                maxScore = player.getHandType().getScore();
            }
        }
        return highestScore;
    }
}
