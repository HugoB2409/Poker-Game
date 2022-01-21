package com.company.pokerType;

import com.company.card.Card;
import com.company.deck.CardDeck;
import com.company.deck.DeckFactory;
import com.company.player.Player;
import com.company.utils.Utils;

import java.util.ArrayList;

public class Texas extends Poker{
    private CardDeck deck;
    private ArrayList<Card> board;

    public Texas() {
        super(2, 9);
    }

    @Override
    public void startGame() {
        do {
            setupGame();
            round();
            checkWinner();
            showCard();
            showWinner();
            clearBoardAndPlayerCard();
        } while (askToPlayAgain() != 2);
    }

    private void setupGame() {
        board = new ArrayList<>();
        deck = new DeckFactory().standardDeck();
        deck.shuffle();
        distributeCards();
    }

    private void distributeCards() {
        for(int i = 0; i < 2; i++) {
            for(Player player: players) {
                player.addCard(deck.getCard());
            }
        }
    }

    private void round() {
        deck.burnCard();
        flop();
        deck.burnCard();
        turn();
        deck.burnCard();
        river();
    }

    private void flop() {
        board.add(deck.getCard());
        board.add(deck.getCard());
        board.add(deck.getCard());
    }

    private void turn() {
        board.add(deck.getCard());
    }

    private void river() {
        board.add(deck.getCard());
    }

    private void checkWinner() {
        for(Player player: players) {
            player.evaluateHand(board);
        }
    }

    private void showCard() {
        System.out.print("\nCarte communautaires: ");
        String separator = "";
        for(Card card: board) {
            System.out.print(separator + card.getName());
            separator = ", ";
        }

        System.out.println();
        for(Player player: players) {
            System.out.print("J" + player.getName() + " :");
            separator = "";
            for(Card card: player.getHand()) {
                System.out.print(separator + card.getName());
                separator = ", ";
            }
            System.out.print(" (" + player.getHandType().getName() + ") ");
            System.out.println();
        }
    }

    private void showWinner() {
        Player winner = Utils.getHighestScore(players);
        System.out.println();
        System.out.println("Le joueur gagnant est J" + winner.getName() + " avec un/une " + winner.getHandType().getName() + ".");
    }

    private void clearBoardAndPlayerCard() {
        board.clear();
        for(Player player: players) {
            player.clearHand();
        }
    }

    private int askToPlayAgain() {
        System.out.println("\nVoulez-vous rejouer ? (1- oui, 2- non)");
        return (Utils.readIntInBetween(1, 2));
    }
}
