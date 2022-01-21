package com.company.pokerType;

import com.company.utils.Utils;
import com.company.player.Player;

import java.util.ArrayList;

public abstract class Poker {
    ArrayList<Player> players = new ArrayList<>();
    int minPlayer;
    int maxPlayer;

    Poker(int minPlayer, int maxPlayer) {
        this.minPlayer = minPlayer;
        this.maxPlayer = maxPlayer;
        generatePlayers(getNbPLayer());
        startGame();
    }

    private int getNbPLayer() {
        System.out.println("Combien de joueurs ? (entre " + minPlayer + " et " + maxPlayer + ")");
        return Utils.readIntInBetween(minPlayer, maxPlayer);
    }

    private void generatePlayers(int nbPlayer) {
        for(int i = 0; i < nbPlayer; i++) {
            players.add(new Player(String.valueOf(i + 1)));
        }
    }

    abstract public void startGame();
}
